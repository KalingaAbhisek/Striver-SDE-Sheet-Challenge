import java.util.*;
/*
	
	Following is the Binary Tree node structure:

	public class TreeNode {
	    int data;
	    TreeNode left;
	    TreeNode right;
	    TreeNode() {}
	    TreeNode(int val) { this.data = val; }
	    TreeNode(int val, TreeNode left, TreeNode right) {
	       this.data = val;
	        this.left = left;
	        this.right = right;
	    }
	}

*/

public class Solution {
    public static List < Integer > getPreOrderTraversal(TreeNode root) {
    	// Write your code here.
        List<Integer> res=new ArrayList<>();
        ans(root,res);
        return res;
    }
    public static void ans(TreeNode root,List<Integer> a) {
        if(root!=null){
            a.add(root.data);
            ans(root.left,a);
            ans(root.right,a);
        }
    }
}
