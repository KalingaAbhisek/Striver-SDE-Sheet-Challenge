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
    public static ArrayList<Integer> getLeftView(TreeNode<Integer> root) 
    {
        //    Write your code here.
        ArrayList<Integer> a = new ArrayList<>();
        inordermodified(root,a,0);
        return a;
    }
    public static void inordermodified(TreeNode<Integer> root,ArrayList<Integer> a,int level){
        if(root==null)
            return;
        if(level==a.size())
            a.add(root.data);
        inordermodified(root.left,a,level+1);
        inordermodified(root.right,a,level+1);
    }
}
