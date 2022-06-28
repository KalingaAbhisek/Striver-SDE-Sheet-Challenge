/*
    Definition of Node class for reference

    class TreeNode<T> 
    {
        public T data;
        public TreeNode<T> left;
        public TreeNode<T> right;

        TreeNode(T data)
        {
            this.data = data;
            left = null;
            right = null;
        }
    }

*/
import java.util.*;
public class Solution {

    static class BSTIterator{
    Stack<TreeNode> st;
        BSTIterator(TreeNode<Integer> root){
            // Write your code here
        st=new Stack<>();
        insert(root);            
        }
    public void insert(TreeNode<Integer> root){
        while(root!=null){
            st.push(root);
            root=root.left;
        }
    }

        int next(){
            // Write your code here
        TreeNode<Integer> pop=st.pop();
        insert(pop.right);
        return pop.data;
        }

        boolean hasNext(){
            // Write your code here
            return !st.isEmpty();
        }
    }
}

/*
    Your BSTIterator object will be instantiated and called as such:
    BSTIterator iterator = new BSTIterator(root);
    while(iterator.hasNext())
    {
       print(iterator.next()+" ");
    }
*/
