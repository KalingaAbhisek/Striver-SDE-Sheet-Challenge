import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static int subarraysXor(ArrayList<Integer> arr, int x) {
		// Write your code here.
        HashMap<Integer,Integer> hm=new HashMap<>();
        int n=arr.size();
        int count=0;
        int xoring=0;
        for(int i=0;i<n;i++){
            xoring^=arr.get(i);
            if(hm.get(xoring^x)!=null)
                count+=hm.get(xoring^x);
            if(xoring==x)
                count++;
            if(hm.get(xoring)!=null)
                hm.put(xoring,hm.get(xoring)+1);
            else
                hm.put(xoring,1);
        }
        return count;
	}
}
