import java.util.ArrayList;

public class Solution {
	public static int longestSubSeg(ArrayList<Integer> arr , int n, int k) {
		// Write your code here.
        int i = 0;
        int j = 0;
        int max = 0;
        while(j<n){                        
           if(arr.get(j) == 0) k--;
           if(k<0){
               while(arr.get(i) != 0) i++; 
               i++;
               k++;
           }else{
               max = Math.max(max,j-i+1);
           }
           j++;
        }
        return max;
	}
}
