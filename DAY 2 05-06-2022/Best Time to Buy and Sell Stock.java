import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
        int minp=prices.get(0);
        int maxp=Integer.MIN_VALUE;
        for(int i:prices){
            minp=Math.min(i,minp);
            maxp=Math.max(maxp,i-minp);
        }
        return maxp;
    }
}
