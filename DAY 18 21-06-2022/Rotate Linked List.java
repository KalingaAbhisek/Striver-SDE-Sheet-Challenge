import java.util.* ;
import java.io.*; 
/***********************************************
    Following is the class structure of the Node class:

    class Node {
        int data;
        Node next;

        Node(int x) {
            this.data = x;
            this.next = null;
        }
    }

************************************************/

public class Solution {
    public static Node rotate(Node head, int k) {
        // Write your code here.
        Node ptr=head;
        Node prev=null;
        int cnt=1;
        while(ptr.next!=null){
            ptr=ptr.next;
            cnt++;
        }
        ptr.next=head;
        k=k%cnt;
        k=cnt-k;
        while(k-->=0){
            prev=ptr;
            ptr=ptr.next;
        }
        prev.next=null;
        return ptr;
    }
}
