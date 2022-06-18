import java.util.*;
public class Solution {
	public static ArrayList<ArrayList<Integer>> pwset(ArrayList<Integer> arr) {
		// WRITE YOUR CODE HERE
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        helper(0,new ArrayList<>(),res,arr);
        return res;
	}
    public static void helper(int ind,ArrayList<Integer> ds,ArrayList<ArrayList<Integer>> res,ArrayList<Integer> arr){
            res.add(new ArrayList<>(ds));
        for(int i=ind;i<arr.size();i++){
            ds.add(arr.get(i));
            helper(i+1,ds,res,arr);
            ds.remove(ds.size()-1);
        }
    }
}

