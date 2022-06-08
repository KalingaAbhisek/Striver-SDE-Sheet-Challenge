import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {

		// Write your code here.
        HashMap<Integer,Integer> hm=new HashMap<>();
        int sum=0;
        int len=0;
        for(int i=0;i<arr.size();i++){
            sum+=arr.get(i);
            if(arr.get(i)==0 && len==0)
                len=1;
            else if(sum==0)
                len=i+1;
            Integer prev=hm.get(sum);
            if(prev!=null){
                len=Math.max(len,i-prev);
            }
            else
                hm.put(sum,i);
        }
        return len;
	}
}
