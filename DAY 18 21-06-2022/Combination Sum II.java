import java.util.*;

public class Solution 
{
    public static ArrayList<ArrayList<Integer>> combinationSum2(ArrayList<Integer> arr, int n, int target)
    {
        //    Write your code here.
        Collections.sort(arr);
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        helper(arr,0,target,res,new ArrayList<>(),0);
        return res;
    }
    public static void helper(ArrayList<Integer> arr,int ind, int target,ArrayList<ArrayList<Integer>> res,ArrayList<Integer> ds,int sum){

        if(sum==target){
            res.add(new ArrayList<>(ds));
            return;
        }
        for(int i=ind;i<arr.size();i++){
            if(i>ind && arr.get(i)==arr.get(i-1)) continue;
            if(sum>target)
                break;
            sum+=arr.get(i);
            ds.add(arr.get(i));
            helper(arr,i+1,target,res,ds,sum);
            sum-=arr.get(i);
            ds.remove(ds.size()-1);
        }
    }
}
