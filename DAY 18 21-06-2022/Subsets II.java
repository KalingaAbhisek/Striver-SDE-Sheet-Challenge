import java.util.*;
public class Solution {
    public static ArrayList<ArrayList<Integer>> uniqueSubsets(int n, int arr[]) {
        // Write your code here..
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        helper(arr,0,new ArrayList<>(),res);
        return res;
    }
    public static void helper(int arr[],int ind, ArrayList<Integer> ds, ArrayList<ArrayList<Integer>> res){
        res.add(new ArrayList<>(ds));
        for(int i=ind;i<arr.length;i++){
            if(i>ind && arr[i]==arr[i-1])
                continue;
            ds.add(arr[i]);
            helper(arr,i+1,ds,res);
            ds.remove(ds.size()-1);
        }
    }

}
