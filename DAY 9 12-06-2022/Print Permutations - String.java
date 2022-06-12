import java.util.*;
public class Solution {
    public static List<String> findPermutations(String s) {
        // Write your code here.
        boolean freq[]=new boolean[s.length()];
        List<String> res=new ArrayList<>();
        helper(new ArrayList<>(),res,s,freq);
        return res;
    }
    public static void helper(List<Character> ds,List<String> res,String s,boolean freq[]){
        if(ds.size()==s.length()){
            String g="";
            for(char t:ds)
                g+=t;
            res.add(g);
            return;
        }
        for(int i=0;i<s.length();i++){
            if(!freq[i]){
                ds.add(s.charAt(i));
                freq[i]=true;
                helper(ds,res,s,freq);
                freq[i]=false;
                ds.remove(ds.size()-1);
            }
        }
    }
}
