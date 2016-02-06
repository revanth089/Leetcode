
public class MinDepth {

public int minDepth(TreeNode root) {
        int left = 0;
        int right = 0;
        
	if(root == null)
		return 0;
	else{
		left = minDepth(root.left);
		right = minDepth(root.right);
		
		if(left< right){
			return (left +1);
		}
		else{
			return (right + 1);
		}
		
	}
       
    }
}
