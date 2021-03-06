/*****************************************************************

    Following is the representation for the Binary Tree Node:

    class BinaryTreeNode<T> {
        T data;
        BinaryTreeNode<T> left;
        BinaryTreeNode<T> right;

        public BinaryTreeNode(T data) {
            this.data = data;
        }
    }

****************************************************************/

public class Solution {

    public static boolean isSymmetric(BinaryTreeNode<Integer> root) {
        // Write your code here.
        if(root==null)
            return true;
        return helper(root.left,root.right);
    }
    public static boolean helper(BinaryTreeNode<Integer> left,BinaryTreeNode<Integer> right){
        if(left==null && right==null)
            return true;
        if(left==null || right==null)
            return false;
        if(!left.data.equals(right.data))
            return false;
        return helper(left.left,right.right) && helper(left.right,right.left);
    }
}
