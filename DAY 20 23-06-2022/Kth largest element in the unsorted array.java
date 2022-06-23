import java.util.*;
public class Solution {

	static int kthLargest(ArrayList<Integer> arr, int size, int K) {
		// Write your code here.
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int smallestelementindex=size-K;
        for(int i=0;i<size;i++){
            pq.add(arr.get(i));
        }
        int cnt=0;
        while(cnt!=smallestelementindex){
            pq.poll();
            cnt++;
        }
        return pq.poll();
	}
}
