import java.util.* ;
import java.io.*; 
public class Solution {
    public static long getTrappedWater(long[] height, int n) {
        // Write your code here.
        if(height.length<3){
            return 0;
        }
        int low=0;
        int high=height.length-1;
        long sum=0;
        long leftmax=0;
        long rightmax=0;
        while(low<=high){
            if(height[low]<height[high]){
                if(height[low]>=leftmax){
                    leftmax=height[low];
                }
                else{
                    sum+=(leftmax-height[low]);
                }
                low++;
            }
            else{
                if(height[high]>=rightmax)
                    rightmax=height[high];
                else{
                    sum+=(rightmax-height[high]);
                }
                high--;
            }
        }
        return sum;        
    }
}
