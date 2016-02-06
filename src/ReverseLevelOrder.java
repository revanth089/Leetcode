import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class ReverseLevelOrder {

	public List<List<Integer>> reverseLevelOrder(TreeNode root){
		
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		TreeNode delimiter = new TreeNode(990990);
		List<Integer> levelElements = new ArrayList<Integer>();
		Stack<List<Integer>> reverseStack = new Stack<List<Integer>>();
		
		
		if(root == null)
		{
			return list;
		}
		Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
		
		queue.add(root);
		queue.add(delimiter);
		levelElements.add(root.val);
		//list.add(levelElements);
		reverseStack.push(levelElements);
		levelElements = new ArrayList<Integer>();
		
		while(!queue.isEmpty()){
			
			TreeNode temp2 = queue.remove();
			
			if(temp2 == delimiter){
				
				if(!queue.isEmpty()){
					if(levelElements != null){
					//list.add(levelElements);
					reverseStack.push(levelElements);
					}
					levelElements = new ArrayList<Integer>();
					queue.add(delimiter);
				}
			}
				else{
					if(temp2.left != null){
						queue.add(temp2.left);
						levelElements.add(temp2.left.val);
					}
					if(temp2.right != null){
						queue.add(temp2.right);
						levelElements.add(temp2.right.val);
					}
				}
		}
		while(!reverseStack.isEmpty()){
			list.add(reverseStack.pop());
		}
		return list;
	}
}
