import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Traversals {

	List<Integer> list = new ArrayList<Integer>();
	public List<Integer> inorderTraversal(TreeNode root) {

		if(root != null){ 
			inorderTraversal(root.left);
			list.add(root.val);
			inorderTraversal(root.right);
			return list;
		}
		else{
			return list;
		}
	}

	public List<Integer> preorderTraversal(TreeNode root) {
		if(root != null){
			list.add(root.val);
			preorderTraversal(root.left);
			preorderTraversal(root.right);
			return list;
		}
		else{
			return list;
		}
	}

	public List<Integer> postorderTraversal(TreeNode root) {
		if(root != null){
			preorderTraversal(root.left);
			preorderTraversal(root.right);
			list.add(root.val);
			return list;
		}
		else{
			return list;
		}
	}
	// List<ArrayList<Integer>> list1 = new ArrayList<ArrayList<Integer>>();
	public List<List<Integer>> levelorderTraversal(TreeNode root){
		
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		TreeNode delimiter = new TreeNode(990990);
		List<Integer> levelElements = new ArrayList<Integer>();
		
		//	Set<Integer> set = new HashSet<Integer>();
		if(root == null)
		{
			return list;
		}
		Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
		
		queue.add(root);
		queue.add(delimiter);
		levelElements.add(root.val);
		list.add(levelElements);
		levelElements = new ArrayList<Integer>();
		
		while(!queue.isEmpty()){
			
			TreeNode temp2 = queue.remove();
			
			if(temp2 == delimiter){
				
				if(!queue.isEmpty()){
					if(levelElements != null)
					list.add(levelElements);
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
		return list;
	}
}
