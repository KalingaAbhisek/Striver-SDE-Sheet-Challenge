import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the LinkedListNode class:
	
	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;

    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/

public class Solution {

	public static boolean isPalindrome(LinkedListNode<Integer> head) {
		// Write your code here!
        if(head==null || head.next==null)
            return true;
        LinkedListNode<Integer> slow=head;
        LinkedListNode<Integer> fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        LinkedListNode<Integer> rev=reverse(slow.next);
        LinkedListNode<Integer> h1=head;
        while(rev!=null && h1!=null){
            if(!h1.data.equals(rev.data)){
                return false;
            }
            rev=rev.next;
            h1=h1.next;
        }
        return true;
	}
    public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head){
        LinkedListNode<Integer> curr=head;
        LinkedListNode<Integer> prev=null;
        while(curr!=null){
            LinkedListNode<Integer> next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
