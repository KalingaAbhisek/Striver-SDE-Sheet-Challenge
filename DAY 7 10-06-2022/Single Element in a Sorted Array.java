import java.io.*;
import java.util.*;

public class Solution 
{
    public static int uniqueElement(ArrayList<Integer> arr) 
    {
        //    Write your code here.
        int ans=-1;
        if(arr.size()==1){
            return arr.get(0);
        }
       for(int i=0;i<arr.size()-1;i+=2){
           if(!arr.get(i).equals(arr.get(i+1))){
                   return arr.get(i);
           }
       }
        if(!arr.get(arr.size()-1).equals(arr.get(arr.size()-2))){
            return arr.get(arr.size()-1);
        }
        return 0;
        
    }
}
