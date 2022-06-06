import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        // Write your code here.
        HashSet<Integer>hs=new HashSet<>();
        int dupli=-1;
        for(int a:arr){
            if(!hs.contains(a)){
                hs.add(a);
            }
            else{
                dupli=a;
                break;
            }
        }
        return dupli;
    }
}
