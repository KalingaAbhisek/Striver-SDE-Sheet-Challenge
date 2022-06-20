import java.util.* ;
import java.io.*; 
/****************************************************************
	
	Following is the structure of the Singly Linked List.
	
	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;

    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

****************************************************************/

public class Solution {
	public static LinkedListNode<Integer> removeKthNode(LinkedListNode<Integer> head, int K) {
        
        LinkedListNode<Integer> start = new LinkedListNode<Integer>(-1);
        start.next = head;
        LinkedListNode<Integer> fast = start;
        LinkedListNode<Integer> slow = start;
        
        
        if(head==null || K==0)
            return head;

        for(int i = 1; i <= K; ++i)
            fast = fast.next;
    
        while(fast.next != null)
        {
            fast = fast.next;
            slow = slow.next;
        }
        
        slow.next = slow.next.next;
        
        return start.next;
	}
}
