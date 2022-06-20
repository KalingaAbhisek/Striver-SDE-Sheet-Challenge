import java.util.* ;
import java.io.*; 
public class Solution {

	public static ArrayList<ArrayList<Integer>> findTriplets(int[] nums, int n, int K)  {

	    // Write your code here.
        Arrays.sort(nums);
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            if(i==0 ||(i>0 && nums[i]!=nums[i-1])){
                int low=i+1;
                int high=nums.length-1;
                int sum=K-nums[i];
                while(low<high){
                  if(nums[low]+nums[high]==sum){
                    while(low<high && nums[low]==nums[low+1]) low++;
                    while(low<high && nums[high]==nums[high-1]) high--;
                    a.add(new ArrayList<>(Arrays.asList(nums[i],nums[low],nums[high]))); 
                    low++; high--;
                }
                else if(nums[low]+nums[high]>sum)
                    high--;
                else
                    low++;
                }
            }
        }
        return a;
	}
}
