import java.util.ArrayList;
import java.util.List;

public class RootToLeafPaths {
	List<String> list = new ArrayList<String>();
	public List<String> binaryTreePaths(TreeNode root) {
		
		int[] paths = new int[256];
		fillarray(root,paths,0);
		return list;
	}
	
	public void fillarray(TreeNode root, int[] paths, int pathLen){
		if(root != null){
			
		paths[pathLen] = root.val;
		pathLen++;
		
		//If Leaf node
		if(root.left == null && root.right ==null){
			//Append String in the List
			fillList(paths,pathLen);
		}
		else{
			//Non Leaf node
			fillarray(root.left,paths,pathLen);
			fillarray(root.right,paths,pathLen);
		}
		}
		
	}
	
	public void fillList(int[] paths,int pathLen){
		String str = "";
		for(int i=0;i<pathLen;i++){
			str+=""+paths[i];
			
			if(i+1!=pathLen){
			str+="->";
			}
		}
		list.add(str);
	}
}
