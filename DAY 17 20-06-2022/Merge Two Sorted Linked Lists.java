import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the linked list node structure:
    
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

************************************************************/

public class Solution {
	public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
		// Write your code here.
        LinkedListNode<Integer> ptr1=first;
        LinkedListNode<Integer> ptr2=second;
        if(first==null)
            return second;
        if(second==null)
            return first;
        LinkedListNode<Integer> res1=new LinkedListNode<>(0);
        LinkedListNode<Integer> res=res1;
        while(ptr1!=null && ptr2!=null){
            if(ptr1.data<ptr2.data){
                res.next=ptr1;
                ptr1=ptr1.next;
                res=res.next;
            }
            else{
                res.next=ptr2;
                ptr2=ptr2.next;
                res=res.next;
            }
        }
        while(ptr1!=null){
            res.next=ptr1;
            ptr1=ptr1.next;
            res=res.next;
        }
        while(ptr2!=null){
            res.next=ptr2;
            ptr2=ptr2.next;
            res=res.next;
        }
        return res1.next;
	}
}
