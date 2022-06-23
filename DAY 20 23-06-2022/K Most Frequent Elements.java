import java.util.*;
public class Solution {

	public static int[] KMostFrequent(int n, int k, int[] arr) {
		// Write your code here.
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->hm.get(b)-hm.get(a));
        pq.addAll(hm.keySet());
        int res[]=new int[k];
        int j=0;
        while(k-->0){
            res[j++]=pq.poll();
        }
        return res;
	}

}
