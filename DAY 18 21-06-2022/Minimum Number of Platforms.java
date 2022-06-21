import java.util.*;
public class Solution {
    public static int calculateMinPatforms(int at[], int dt[], int n) {
        // Write your code here.
        Arrays.sort(at);
        Arrays.sort(dt);
        int i=1;
        int j=0;
        int ptfrms=1,max=1;;
        while(i<n && j<n){
            if(at[i]<=dt[j]){
                ptfrms++;
                i++;
            }
            else if(at[i]>dt[j]){
                ptfrms--;
                j++;
            }
            max=Math.max(max,ptfrms);
        }
        return max;
    }
}
