import java.util.*;
public class Solution {
    public static int romanToInt(String s) {
        // Write your code here
        ArrayList<Integer> alist=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I')
                alist.add(1);
            else if(s.charAt(i)=='V')
                alist.add(5);
            else if(s.charAt(i)=='X')
                alist.add(10);
            else if(s.charAt(i)=='L')
                alist.add(50);
            else if(s.charAt(i)=='C')
                alist.add(100);
            else if(s.charAt(i)=='D')
                alist.add(500);
            else if(s.charAt(i)=='M')
                alist.add(1000);
        }
        int ans=0;
        int i;
        for(i=alist.size()-1;i>0;i--){
            if(alist.get(i)>alist.get(i-1)){
                ans+=alist.get(i)-alist.get(i-1);
                i--;
            }
            else
                ans+=alist.get(i);
        }
        if(i!=-1){
            ans+=alist.get(i);
        }   
        return Math.abs(ans);
    }
}
