import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class RightSide {

	public List<Integer> rightSideView(TreeNode head){
		TreeNode temp2 = new TreeNode(999090);
		List<Integer> values = new ArrayList<Integer>();
		
		if(head == null){
			return values;
		}
		
		Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
		
		queue.add(head);
		queue.add(temp2);
		values.add(head.val);
		
		while (!queue.isEmpty()){
			TreeNode temp  =  queue.remove();
			
			if(temp == temp2){
				// Its end of a level
				values.add(temp.val);
				queue.add(temp2);
			}
			else{
				if(temp.left != null){
				queue.add(temp.left);
				}
				if(temp.right != null){
					queue.add(temp.right);
				}
			}
			
		}
		
		return values;
		
		
	}
}
