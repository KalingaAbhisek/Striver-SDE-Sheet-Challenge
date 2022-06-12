import java.util.*;
public class Solution {
    public static ArrayList<Integer> subsetSum(int num[]) {
        // Write your code here..
        ArrayList<Integer> res=new ArrayList<>();
        combi(0,0,res,num );
        Collections.sort(res);
        return res;
        
    }
    public static void combi(int ind,int sum,ArrayList<Integer> res,int num[]){
        if(ind>=num.length){
            res.add(sum);
            return;
        }
        combi(ind+1,sum+num[ind],res,num);
        combi(ind+1,sum,res,num);
        }
    }
