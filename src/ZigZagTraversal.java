import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ZigZagTraversal {

	List<List<Integer>> list= new ArrayList<List<Integer>>();
	List<Integer> innerList = new ArrayList<Integer>();
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

		Boolean leftToRight = true;

		if(root == null)
			return list;

		Stack<TreeNode> stack = new Stack<TreeNode>();
		Stack<TreeNode> revStack = new Stack<TreeNode>();

		stack.push(root);

		while(!stack.isEmpty()){

			TreeNode temp = stack.pop();
			innerList.add(temp.val);
			if(temp != null && leftToRight){
				if(temp.left != null){
					revStack.push(temp.left);
				}
				if( temp.right != null){
					revStack.push(temp.right);
				}
			}
			if(temp != null && !leftToRight){
				if( temp.right != null){
					revStack.push(temp.right);
				}
				if(temp.left != null){
					revStack.push(temp.left);
				}
			}
			if(stack.isEmpty()){
				if(!innerList.isEmpty())
				list.add(innerList);
				innerList = new ArrayList<Integer>();
				leftToRight = !leftToRight;
				while(!revStack.isEmpty()){
					TreeNode temp2 = revStack.pop();
					innerList.add(temp2.val);
					if(temp2!= null && leftToRight){

						if(temp2.left != null){
							stack.push(temp2.left);
						}
						if( temp2.right != null){
							stack.push(temp.right);
						}

					}
					if(temp2!= null && !leftToRight){

						if( temp2.right != null){
							stack.push(temp2.right);
						}
						if(temp2.left != null){
							stack.push(temp2.left);
						}

					}
				}
				leftToRight = !leftToRight;
				if(!innerList.isEmpty())
				list.add(innerList);
				innerList = new ArrayList<Integer>();
			}
		}
		stack = null;
		revStack = null;
		return list;
	}

}
