/*************************************************************
    Following is the Binary Search Tree node structure

	class TreeNode<T> {
	    public T data;
	    public TreeNode<T> left;
	    public TreeNode<T> right;

	    TreeNode(T data) {
	        this.data = data;
	        left = null;
	        right = null;
	    }
	}

*************************************************************/

import java.util.*;

public class Solution {
    static int c=0;
	public static int KthLargestNumber(TreeNode<Integer> root, int k) {
		// Write your code here.
        {
            c=0;
        }
        int ans[]=new int[1];
        ans[0]=-1;
//         int n=count(root);
        revinorder(root,k,ans);
        return ans[0];
	}
    public static int revinorder(TreeNode<Integer> root,int k,int ans[]){
        if(root==null ||c>=k)
            return c;
        revinorder(root.right,k,ans);
        c++;
        if(k==c){
            ans[0]=root.data;
        }
        return revinorder(root.left,k,ans);
    }
//     public static int count(TreeNode<Integer> root){
//         if(root==null)
//             return 0;
//         return 1+count(root.left)+count(root.right);
//     }
}
