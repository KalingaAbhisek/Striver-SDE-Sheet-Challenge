/*************************************************************************

    Following is the class structure of the Node class:

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

*************************************************************************/
class NodeValue{
    public int maxNode,minNode,maxSize;
    NodeValue(int minNode, int maxNode,int maxSize){
        this.minNode=minNode;
        this.maxNode=maxNode;
        this.maxSize=maxSize;
    }
}
public class Solution {
	public static int largestBST(TreeNode<Integer> root) {
		// Write your code here.
        return NodeHelper(root).maxSize;

	}
    public static NodeValue NodeHelper(TreeNode<Integer> root){
        if(root==null)
            return new NodeValue(Integer.MAX_VALUE,Integer.MIN_VALUE,0);
        NodeValue left=NodeHelper(root.left);
        NodeValue right=NodeHelper(root.right);
        if(left.maxNode<root.data && root.data<right.minNode){
            return new NodeValue(Math.min(root.data,left.minNode),Math.max(root.data, right.maxNode),left.maxSize + right.maxSize + 1);
        }
        return new NodeValue(Integer.MIN_VALUE, Integer.MAX_VALUE,Math.max(left.maxSize, right.maxSize));
    }
}
