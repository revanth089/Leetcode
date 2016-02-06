import java.util.ArrayList;
import java.util.List;

public class PathSumList {
	
	
	public List<List<Integer>> pathSumList(TreeNode root,int sum){
		
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		List<Integer> innerList = new ArrayList<Integer>();
		
		pathsum(root,sum,list,innerList);
		
		return list;
	}
	
	public void pathsum(TreeNode root, int sum,List<List<Integer>> list, List<Integer> innerList){
		
		if(root == null)
			return;
		
		if(sum == root.val && root.left ==null && root.right ==null){
			innerList.add(root.val);
		}
		
		sum -= root.val;
		pathsum(root,sum,list,innerList);
	}

}
