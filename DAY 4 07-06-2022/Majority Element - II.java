import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {
        // Write your code here.
        HashMap<Integer,Integer> hm=new HashMap<>();
        ArrayList<Integer> alist=new ArrayList<>();
        for(int i=0;i<arr.size();i++){
            hm.put(arr.get(i),hm.getOrDefault(arr.get(i),0)+1);
        }
        int max=Integer.MIN_VALUE;
        int ele=-1;
        for(int i:hm.keySet()){
            if(hm.get(i)>(arr.size()/3))
                alist.add(i);
        }
            return alist;
    }
}
