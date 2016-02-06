package BST;

public class SortedArrayToBST {
	
	 public TreeNode sortedArrayToBST(int[] nums) {
		 
	    int length = nums.length;
	    if(length == 0){
	        return null;
	    }
	    if(length == 1){
	        return new TreeNode(nums[0]);
	    }
	    TreeNode node = new TreeNode(nums[length/2]);
	    
	   
		 return helper(0,length-1,nums,node);
	    }
	 
	 public TreeNode helper(int start,int end, int[] arr, TreeNode node){
		 
		 if(start> end)
			 return null;
			 
		 if(end == start){
			  node.val = arr[start];
			  //System.out.println(end);
			  return node;
		 }
		if(end - start == 1){
			node.val = arr[start];
			node.right = new TreeNode(arr[end]);
			node.left = null;
			return node;
		}
		 int mid = start + (end-start)/2;
		// System.out.println(mid);
		 node.val = arr[mid];
		 node.left = helper(start,mid-1,arr,new TreeNode(0));
		 node.right = helper(mid+1,end,arr,new TreeNode(0));
		 
		 return node;
	 }

}
