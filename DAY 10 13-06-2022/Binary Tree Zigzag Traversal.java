/*
	Following is the class used to represent the object/node of the Binary Tree

	class BinaryTreeNode<T> {
	    T data;
	    BinaryTreeNode<T> left;
	    BinaryTreeNode<T> right;

	    public BinaryTreeNode(T data) {
	        this.data = data;
	    }
	}
*/
import java.util.*;
public class Solution {
	public static List<Integer> zigZagTraversal(BinaryTreeNode<Integer> root) {
		// Write your code here!
        List<Integer> finalli=new ArrayList<>();
        List<List<Integer>> res= new ArrayList<>();
        ArrayDeque<BinaryTreeNode<Integer>> ele = new ArrayDeque<>();
        if(root==null)
            return finalli;
        ele.add(root);
        while(ele.isEmpty()==false){
            ArrayList<Integer> a = new ArrayList<>();
            int size=ele.size();
             for(int i=0;i<size;i++){
                BinaryTreeNode<Integer> curr=ele.poll();
                a.add(curr.data);
                if(curr.left!=null)
                    ele.add(curr.left);
                if(curr.right!=null)
                    ele.add(curr.right);
             }
            res.add(a);
        }
        for(int i=1;i<res.size();i+=2){
            Collections.reverse(res.get(i));
        }
        for(List<Integer> a:res){
            for(int x:a)
                finalli.add(x);
        }
        return finalli;
	}
}
