import java.util.* ;
import java.io.*; 
public class Solution {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        // Write your code here.
        HashSet<Integer> tset=new HashSet<>();
        for(int i=0;i<N;i++){
            tset.add(arr[i]);
        }
        int max=Integer.MIN_VALUE;
        for(int i:tset){
            if(!tset.contains(i-1)){
                int count=1;
                int diff=1;
                while(tset.contains(i+diff)){
                    count++;
                    diff++;
                }
                max=Math.max(count,max);
            }
        }
        return max;
    }
}
