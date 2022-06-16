/*************************************************************
    Following is the Binary Tree node structure

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

import java.util.ArrayList;
public class Solution {
    static int prede=-1;
    static int succe=-1;
	public static ArrayList<Integer> predecessorSuccessor(BinaryTreeNode<Integer> root, int key) {
        {
            prede=-1;
            succe=-1;
        }
		// Write your code here.
        ArrayList<Integer> alist=new ArrayList<>();                       alist.add(prede);
        alist.add(succe);
        if(root==null)
            return alist;
        alist=new ArrayList<>();
        inpred(root,key);
        insucce(root,key);
        alist.add(prede);
        alist.add(succe);
        return alist;        
	}
    public static void insucce(BinaryTreeNode<Integer> root,int key){
        while(root!=null){
            if(key>=root.data){
                root=root.right;
            }
            else{
                succe=root.data;
                root=root.left;
            }
        }
    }
    public static void inpred(BinaryTreeNode<Integer> root,int key){
        while(root!=null){
            if(key<=root.data){
                root=root.left;
            }
            else{
                prede=root.data;
                root=root.right;
            }
        }
    }
}
