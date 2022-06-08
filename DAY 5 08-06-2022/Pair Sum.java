import java.util.* ;
import java.io.*; 
public class Solution{
    public static int[][] pairSum(int[] arr, int s) {
        // Write your code here.
        Arrays.sort(arr);
        int count=0;
        int k=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if((arr[i]+arr[j])==s){
                    count++;
                }
            }
        }
        int res[][]=new int[count][2];
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==s){
                    if(arr[i] < arr[j])
                    {
                        res[k][0] = arr[i];
                        res[k][1] = arr[j];
                    }
                    else
                    {
                        res[k][0] = arr[j];
                        res[k][1] = arr[i];
                    }
                    k++;
                }
            }
        }
        return res;
        
    }
}
