import java.util.*;

public class Solution {

	public static ArrayList<Integer> countDistinctElements(ArrayList<Integer> arr, int k) {

		// Write your code here
        int n=arr.size();
        ArrayList<Integer> answer=new ArrayList<Integer>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<k;i++){
            hm.put(arr.get(i),hm.getOrDefault(arr.get(i),0)+1);
        }
        answer.add(hm.size());
        for(int i=k;i<n;i++){
            hm.put(arr.get(i-k),hm.get(arr.get(i-k))-1);
            if(hm.get(arr.get(i-k))==0)
                hm.remove(arr.get(i-k));
            hm.put(arr.get(i),hm.getOrDefault(arr.get(i),0)+1);
            answer.add(hm.size());
        }
        return answer;
	}
}
