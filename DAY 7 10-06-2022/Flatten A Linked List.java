import java.util.* ;
import java.io.*; 
/****************************************************************

       Following is the class structure of the Node class:

       class Node {
	int data;
	Node next;
	Node child;

	public Node(int data) {
		this.data = data;
		this.next = null;
		this.child = null;
	}
}

*****************************************************************/
public class Solution {
	public static Node flattenLinkedList(Node start) {
		 //Write your code here
        if(start==null || start.next==null)
            return start;
        start.next=flattenLinkedList(start.next);
        start=merge(start,start.next);
        return start;
	}
    public static Node merge(Node a,Node b){
        Node dummy=new Node(0);
        Node res=dummy;
        while(a!=null && b!=null){
            if(a.data<b.data){
                res.child=a;
                a=a.child;
            }
            else{
                res.child=b;
                b=b.child;
            }
            res=res.child;
        }
        if(a!=null)
            res.child=a;
        if(b!=null)
            res.child=b;
        return dummy.child;
    }
}

