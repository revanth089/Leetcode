
public class SameTree {
	
	public boolean isSameTree(TreeNode p, TreeNode q){
		if(p == null && q == null){
			return true;
		}
		if(p == null || q == null){
			return false;
		}
		Boolean left = isSameTree(p.left,q.left);
		Boolean right = isSameTree(p.right,q.right);
		
		if(p.val == q.val)
			return true;
		
		return left&&right;
		//return ((p.val == q.val) && isSameTree(p.left,q.left) && isSameTree(p.right,q.right));
	}

}
