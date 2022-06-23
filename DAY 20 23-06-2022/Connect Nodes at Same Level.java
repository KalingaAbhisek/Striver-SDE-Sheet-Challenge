/*
    ----------------- Binary Tree node class for reference -----------------

    class BinaryTreeNode<T> {
	    public T data;
	    public BinaryTreeNode<T> left;
	    public BinaryTreeNode<T> right;
	    public BinaryTreeNode<T> next;

	    BinaryTreeNode(T data) {
	        this.data = data;
	        left = null;
	        right = null;
	        next = null;
	    }
	};

*/

public class Solution {
	public static void connectNodes(BinaryTreeNode<Integer> root) {
    	// Write your code here.
        BinaryTreeNode<Integer> dummy=new BinaryTreeNode<>(0);
        BinaryTreeNode<Integer> ptr=dummy;
        while(root!=null){
            if(root.left!=null){
                ptr.next=root.left;
                ptr=ptr.next;
            }
            if(root.right!=null){
                ptr.next=root.right;
                ptr=ptr.next;
            }
            root=root.next;
            if(root==null){
                ptr=dummy;
                root=dummy.next;
                dummy.next=null;
            }
        }
	}
}
