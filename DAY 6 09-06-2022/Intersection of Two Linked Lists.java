import java.util.* ;
import java.io.*; 
/************************************
	 
	 //Following is the class structure of the LinkedListNode class:
	 
	  class LinkedListNode<T> {
		public T data;
		public LinkedListNode<T> next;
		
		public LinkedListNode(T data) {
			this.data = data;
			this.next = null;
		}
	}

*****************************************/
public class Solution {

	public static int findIntersection(LinkedListNode<Integer> firstHead, LinkedListNode<Integer> secondHead) {
        LinkedListNode<Integer> pA=firstHead;
        LinkedListNode<Integer> pB=secondHead;
        int count1=0;
        int count2=0;
        while(pA!=null){
            count1++;
            pA=pA.next;
        }
        while(pB!=null){
            count2++;
            pB=pB.next;
        }
        pA=firstHead;
        pB=secondHead;
        int diff=Math.abs(count1-count2);
        if(count1>count2){
            while(diff-->=1)
                pA=pA.next;
        }
        else if(count2>count1){
            while(diff-- >=1)
                pB=pB.next;
        }
        while(pA!=null && pB!=null){
            if(pA==pB){
                return pA.data;
            }
            pA=pA.next;
            pB=pB.next;
        }
        return -1;
		
	}
}
