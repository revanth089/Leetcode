package BST;

public class SortedListToBST {
	public TreeNode sortedListToBST(ListNode head) {

		if(head == null)
			return null;

		TreeNode node = new TreeNode(head.val);
		node.left = node.right = null;

		if(head.next == null){
			return node;
		}

		ListNode tempF = head;
		ListNode tempS = head;
		ListNode prev = head;

		while(tempF!=null && tempF.next!=null){
			tempF = tempF.next.next;
			prev = tempS;
			tempS = tempS.next;
		}

		prev.next = null;
		node.val = tempS.val;

		node.left.val = head.val;
		node.right = sortedListToBST(tempS);
		//tempS = null;
		node.left = sortedListToBST(head);

		return node;
	}
}
