import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Node class:

    class LinkedListNode {
        int data;
        LinkedListNode next;
        
        public LinkedListNode(int data) {
            this.data = data;
        }
    }

*****************************************************************/


public class Solution {
    static LinkedListNode addTwoNumbers(LinkedListNode head1, LinkedListNode head2) {
        // Write your code here.
        LinkedListNode p1=head1;
        LinkedListNode p2=head2;
        LinkedListNode res=new LinkedListNode(-1);
        LinkedListNode res1=res;
        int carry=0;
        while(p1!=null || p2!=null || carry!=0){
            int sum=0;
            if(p1!=null){
                sum+=p1.data;
                p1=p1.next;
            }
            if(p2!=null){
                sum+=p2.data;
                p2=p2.next;
            }
            sum+=carry;
            int store=sum%10;
            carry=sum/10;
            LinkedListNode storelinkedlist=new LinkedListNode(store);
            res1.next=storelinkedlist;
            res1=res1.next;
        }
        return res.next;
    }
}
