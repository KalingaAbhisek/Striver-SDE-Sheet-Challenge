/*************************************************************

Following is the Binary Tree node structure

class BinaryTreeNode<T> 
{
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    BinaryTreeNode(T data) {
        this.data = data;
        left = null;
        right = null;
    }
};

*************************************************************/
public class Solution {

	public static boolean isBalancedBT(BinaryTreeNode<Integer> root) {
		// Write your code here.
        return helper(root)!=-1;
	}
    public static int helper(BinaryTreeNode<Integer> root){
        if(root==null)
            return 0;
        int left=helper(root.left);
        if(left==-1)
            return -1;
        int right=helper(root.right);
        if(right==-1)
            return -1;
        if(Math.abs(left-right)>1)
            return -1;
        return Math.max(left,right)+1;
    }
}
