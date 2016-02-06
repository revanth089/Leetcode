
public class SymmetricTree {

	public Boolean isSymmetric(TreeNode root){
		
		if(root == null){
			return true;
		}
		
		return areSymmetric(root.left,root.right);
		
		
	}
	
	public Boolean areSymmetric(TreeNode left, TreeNode right){
		
		if(left ==null && right ==null){
			return true;
		}
		if(left == null || right == null){
			return false;
		}
		
		return ((left.val == right.val) && areSymmetric(left.left,right.right) && areSymmetric(left.right,right.left));
		
	}
}
