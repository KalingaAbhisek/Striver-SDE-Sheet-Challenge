import java.util.* ;
import java.io.*; 
public class Solution {
	public static int findMajority(int[] arr, int n) {
		// Write your code here.
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        int max=Integer.MIN_VALUE;
        int ele=-1;
        for(int i:hm.keySet()){
            if(max<hm.get(i)){
                max=hm.get(i);
                ele=i;
            }
        }
        if(max>(n/2))
            return ele;
        else
            return -1;
	}
}
