import java.util.ArrayList;
import java.io.*;
import java.util.*;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        int[] res=new int[2];
        int count[]=new int[n+1];
        for(int i:arr){
            count[i]++;
        }
        for(int i=1;i<count.length;i++){
            if(count[i]==0){
                res[0]=i;
                break;
            }
        }
        HashSet<Integer> hs=new HashSet<>();
        for(int i:arr){
            if(!hs.contains(i)){
                hs.add(i);
            }
            else{
                res[1]=i;
                break;
            }
        }
        return res;
        
    }
}
