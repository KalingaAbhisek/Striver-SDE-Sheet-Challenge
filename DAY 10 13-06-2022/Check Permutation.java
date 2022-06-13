import java.util.*;
import java.io.*;

public class Solution {
    public static boolean areAnagram(String str1, String str2){
        // Write your code here.
        HashMap<Character,Integer> hm=new HashMap<>();
        if(str1.length()!=str2.length()){
            return false;
        }
        for(int i=0;i<str1.length();i++){
            hm.put(str1.charAt(i),hm.getOrDefault(str1.charAt(i),0)+1);
        }
        for(int i=0;i<str2.length();i++){
            if(!hm.containsKey(str2.charAt(i)))
                return false;
            if(hm.containsKey(str2.charAt(i)))
                hm.put(str2.charAt(i),hm.getOrDefault(str2.charAt(i),0)-1);
            if(hm.get(str2.charAt(i))<0)
                return false;
        }
        return true;
    }
}
