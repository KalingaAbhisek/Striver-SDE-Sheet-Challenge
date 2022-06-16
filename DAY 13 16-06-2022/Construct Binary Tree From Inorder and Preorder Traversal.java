/************************************************************

    Following is the TreeNode class structure

    class TreeNode<T>
    {
       public:
        T data;
        TreeNode<T> left;
        TreeNode<T> right;

        TreeNode(T data)
        {
            this.data = data;
            left = null;
            right = null;
        }
    };

************************************************************/

import java.util.*;

public class Solution 
{
    public static TreeNode<Integer> buildBinaryTree(ArrayList<Integer> inorder, ArrayList<Integer> preorder) 
    {
        //    Write your code here.
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<inorder.size();i++){
            hm.put(inorder.get(i),i);
        }
        TreeNode<Integer> root=helper(preorder,0,preorder.size()-1,inorder,0,inorder.size()-1,hm);
        return root;
    }
    public static TreeNode<Integer> helper(ArrayList<Integer> preorder,int prestart,int preend,ArrayList<Integer> inorder,int instart,int inend,HashMap<Integer,Integer> hm){
        if(prestart>preend || instart>inend){
            return null;
        }
        TreeNode<Integer> root=new TreeNode<>(preorder.get(prestart));
        int inroot=hm.get(root.data);
        int numleft=inroot-instart;
        root.left=helper(preorder,prestart+1,prestart+numleft,inorder,instart,inroot-1,hm);
        root.right=helper(preorder,prestart+numleft+1,preend,inorder,inroot+1,inend,hm);
        return root;
    }
}
