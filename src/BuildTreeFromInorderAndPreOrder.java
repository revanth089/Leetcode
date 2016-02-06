
public class BuildTreeFromInorderAndPreOrder {
	

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int preIndex = 0;
        int start,end =0;
    	TreeNode root = new TreeNode(preorder[preIndex]);
    	for(int i=0;i<inorder.length;i++){
    		if(inorder[i] == preorder[preIndex]){
    			break;
    		}
    		else{
    			end++;
    		}
    	}
    	preIndex++;
    	root.left = buildTree(preorder,inorder,0,end,preIndex);
    	root.right = buildTree(preorder,inorder,end+2,inorder.length-1,preIndex);
    	return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder, int start, int end,int preIndex){
    	
    	TreeNode root = new TreeNode(preorder[preIndex]);
    	
    	for(int i=start;i<inorder.length;i++){
    		if(inorder[i] == preorder[preIndex]){
    			break;
    		}
    		else{
    			start++;
    			end =i;
    		}
    	}
    	
    	
    	root.left = buildTree(preorder,inorder,start,end,preIndex);
    	root.right = buildTree(preorder,inorder,end+2,inorder.length-1,preIndex);
    	
    	
    	return null;
    }


}
