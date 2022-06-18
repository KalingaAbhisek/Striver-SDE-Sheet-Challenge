import java.util.*;


public class Solution {
	public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int n, int k) {
		//Write your code here
        int small=0;
        ArrayList<Integer> res=new ArrayList<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b)->Integer.compare(b,a));
        for(int item:arr) {
            minHeap.offer(item);
            if(minHeap.size()>k) {
                minHeap.poll();
            }
        }
        res.add(minHeap.peek());
        minHeap = new PriorityQueue<>();
        for(int item:arr) {
            minHeap.offer(item);
            if(minHeap.size()>k) {
                minHeap.poll();
            }
        }
        res.add(minHeap.peek());
        return res;
	}
}
