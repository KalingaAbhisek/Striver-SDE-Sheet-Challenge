/*************************************************************

Following is the Binary Tree Node structure:

    class TreeNode<T> {
		public T data;
		public BinaryTreeNode<T> left;
		public BinaryTreeNode<T> right;

		TreeNode(T data) {
			this.data = data;
			left = null;
			right = null;
	  	}
    }

*************************************************************/

public class Solution {
    static int maxi=0;
	public static int diameterOfBinaryTree(TreeNode<Integer> root) {
		// Write your code here.
        if(root==null)
            return 0;
        int left=check(root.left);
        int right=check(root.right);
        int curr=left+right;
        int leftdia=diameterOfBinaryTree(root.left);
        int rightdia=diameterOfBinaryTree(root.right);        
        return Math.max(curr,Math.max(leftdia,rightdia));
	}
    public static int check(TreeNode<Integer> root){
        if(root==null)
            return 0;
        int lh=check(root.left);
        int rh=check(root.right);
        return Math.max(lh,rh)+1;
    }
}
