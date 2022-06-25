import java.util.*;
public class Solution 
{
    public static ArrayList<ArrayList<Integer>> findSubsetsThatSumToK(ArrayList<Integer> arr, int N, int k) 
	{
        // Write your code here.
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        combination(0,arr,k,res,new ArrayList<>(),0);
        return res;
    }
    public static void combination(int ind,ArrayList<Integer> arr,int target,ArrayList<ArrayList<Integer>> res,ArrayList<Integer> a,int sum){
        if(ind==arr.size()){
            if(sum==target)
                res.add(new ArrayList<>(a));
            return;
        }
        a.add(arr.get(ind));
        combination(ind+1,arr,target,res,a,sum+arr.get(ind));
        a.remove(a.size()-1);
        combination(ind+1,arr,target,res,a,sum);
    }
}
