import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class ReverseTraversal {
	
	public List<List<Integer>> levelOrderBottom(TreeNode root){
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list3 = new ArrayList<Integer>();
		List<List<Integer>> list2 = new ArrayList<List<Integer>>();
		Stack<Integer> stack = new Stack<Integer>();
		TreeNode delimiter = new TreeNode(22121);


		Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
		TreeNode temp = null;

		if(root == null){
			return list2;
		}
		queue.add(root);
		list1.add(root.val);
		stack.push(root.val);
		//list1.add(root.val);
		queue.add(delimiter);
		list1.add(delimiter.val);
		stack.push(delimiter.val);
		while(!queue.isEmpty())
		{
			temp = queue.remove();
			if(temp == delimiter)
			{
//				list2.add(list1);
//				list1 = new ArrayList<Integer>();
				if(!queue.isEmpty())
					queue.add(delimiter);
				    list1.add(delimiter.val);
				    stack.push(delimiter.val);
			}
			else{
				if(temp.left != null){
					queue.add(temp.left);
					list1.add(temp.left.val);
					stack.push(temp.left.val);
					//list1.add(temp.left.val);
				}
				if(temp.right != null){
					queue.add(temp.right);
					list1.add(temp.right.val);
					stack.push(temp.right.val);
					//list1.add(temp.right.val);
				}
			}
		}
		int i=0;
//		for(i=0;i<list1.size();i++)
//		{
//			if(list1.get(i) == delimiter.val){
//				list2.add(list3);
//				list3 =new ArrayList<Integer>();
//			}
//			else{
//				list3.add(list1.get(i));
//			}
//		}
		while (!stack.isEmpty()){
			int tempT = stack.pop();
			if(tempT == delimiter.val){
				list2.add(list3);
				list3 = new ArrayList<Integer>();
			}
			else{
				list3.add(tempT);
			}
		}
		



		return list2;
	}

}
