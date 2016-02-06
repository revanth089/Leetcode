package BST;

import java.util.ArrayList;
import java.util.List;

public class RootToLeafNumberSum {
	
	 public int sumNumbers(TreeNode root) {
		 
		 if(root== null)
			 return 0;
	        
		 List<Integer> list = new ArrayList<Integer>();
		 return  sumNumbers(root,0);
	    }
	 
	 public int sumNumbers(TreeNode root, int sum){
		 int pathNumber = 0;
		 int totalPathsSum = 0;
		 
		if(root.left == null && root.right == null){
			return sum+root.val;
		}
		
		return (sumNumbers(root.left, (sum+root.val)*10) + sumNumbers(root.right, (sum+root.val)*10));
		 
			 
	 }

}
