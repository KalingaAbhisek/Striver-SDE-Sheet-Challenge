/*

	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T val;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T val) {
			this.val = val;
			this.left = null;
			this.right = null;
		}
	}

*/

import java.util.*;

public class Solution {

  public static ArrayList<Integer> getLevelOrder(BinaryTreeNode root) {
    //Your code goes here
        ArrayList<Integer> a= new ArrayList<>();
        ArrayDeque<BinaryTreeNode> arr=new ArrayDeque<>();
        if(root==null)
            return a;
        arr.add(root);
        while(arr.isEmpty()==false){
            int count=arr.size();
            for(int i=0;i<count;i++){
                BinaryTreeNode curr=arr.poll();
                a.add(curr.val);
                if(curr.left!=null)
                    arr.add(curr.left);
                if(curr.right!=null)
                    arr.add(curr.right);
            }
        }
        return a;
  }

}
