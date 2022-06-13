/************************************************************

	Following is the Binary Tree node structure:

	class BinaryTreeNode<T> {
	    T data;
	    BinaryTreeNode<T> left;
	    BinaryTreeNode<T> right;

	    public BinaryTreeNode(T data) {
	        this.data = data;
	    }
	}

************************************************************/
import java.util.*;
public class Solution {
    public static List<List<Integer>> getTreeTraversal(BinaryTreeNode<Integer> root) {
        // Write your code here.
        List<Integer> inorderlist=new ArrayList<>();
        List<Integer> preorderlist=new ArrayList<>();
        List<Integer> postorderlist=new ArrayList<>();
        List<List<Integer>> lili=new ArrayList<>();
        inorder(root,inorderlist);
        preorder(root,preorderlist);
        postorder(root,postorderlist);
        lili.add(inorderlist);
        lili.add(preorderlist);
        lili.add(postorderlist);
        return lili;
        
    }
    public static void inorder(BinaryTreeNode<Integer> root,List<Integer> inorderlist){
        if(root!=null){
            inorder(root.left,inorderlist);
            inorderlist.add(root.data);
            inorder(root.right,inorderlist);            
        }
    }
    public static void preorder(BinaryTreeNode<Integer> root,List<Integer> preorderlist){
        if(root!=null){
            preorderlist.add(root.data);
            preorder(root.left,preorderlist);
            preorder(root.right,preorderlist);            
        }
    }
    public static void postorder(BinaryTreeNode<Integer> root,List<Integer> postorderlist){
        if(root!=null){
            postorder(root.left,postorderlist);
            postorder(root.right,postorderlist);    
            postorderlist.add(root.data);
        }
    }
}
