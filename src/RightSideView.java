import java.util.ArrayList;
import java.util.List;

public class RightSideView {

	List<Integer> list = new ArrayList<Integer>(); 
	public List<Integer> rightSideView(TreeNode root) {
        
	if(root == null){
		return list;
	}
	else{
		list.add(root.val);
		rightSideView(root.right);
		
	}
	
	return list;
    }
}
