/*************************************************************
    
    Following is the Binary Tree node structure:

    class BinaryTreeNode {

	int data;
	BinaryTreeNode left;
	BinaryTreeNode right;
	
	BinaryTreeNode(int data) {
		this.data = data;
		left = null;
		right = null;
	   }
    }

*************************************************************/
import java.util.*;
public class Solution {
	public static boolean pairSumBst(BinaryTreeNode root, int k) {
		// Write your code here.
        HashSet<Integer> hs=new HashSet<>();
        inorder(root,hs);
        for(int i:hs){
            if(hs.contains(k-i))
                return true;
        }
        return false;
	}
    public static void inorder(BinaryTreeNode root,HashSet<Integer> hs){
        if(root!=null){
            inorder(root.left,hs);
            hs.add(root.data);
            inorder(root.right,hs);  
        }
    }
}

