import java.util.*;
public class Solution {

    // minHeap function which take size of Queries and Queries as Input.
// Returns an array out outputs depending on the query.
    static int[] minHeap(int n, int[][] q) {
        // Write your code here.
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(q[i][0]==0)
                pq.offer(q[i][1]);
            else{
                if(!pq.isEmpty()){
                    res.add(pq.poll());
                }
            }
        }
        int res1[]=new int[res.size()];
        int k=0;
        for(int i:res){
            res1[k++]=i;
        }
        return res1;
    }
}
