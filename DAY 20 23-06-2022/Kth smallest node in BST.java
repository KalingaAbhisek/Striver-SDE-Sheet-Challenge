/************************************************************

    Following is the TreeNode class structure

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

************************************************************/


public class Solution 
{
    static int count=0;
    static int ans=0;
	public static int kthSmallest(TreeNode<Integer> root, int k) 
	{
		//  Write your code here.
        {
            count=0;
            ans=0;
        }
        aisehi(root,k);
        return ans;
	}
    public static void aisehi(TreeNode<Integer> root, int k){
        if(root==null)
            return;
        aisehi(root.left,k);
        count++;
        if(count==k){
            ans=root.data;
        }
        aisehi(root.right,k);
    }

}
