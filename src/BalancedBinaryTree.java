
public class BalancedBinaryTree {

	 public boolean isBalanced(TreeNode root) {
	        int leftHeight;
	        int rightHeight;
	        
	        if(root ==null)
	        	return true;
	        else{
	        	leftHeight = height(root.left);
	        	rightHeight = height(root.right);
	        	
	        	if (Math.abs(rightHeight-leftHeight) <=1){
	        		return true;
	        	}
	        	else
	        		return false;
	        	
	        }
	    }
	 public int height(TreeNode root){
		 int left,right =0;
		 if(root == null)
			 return 0;
		 else{
			left = height(root.left);
			right = height(root.right);
			
			if(left>right)
				return (left+1);
			else
				return (right+1);
					
		 }
	 }
}
