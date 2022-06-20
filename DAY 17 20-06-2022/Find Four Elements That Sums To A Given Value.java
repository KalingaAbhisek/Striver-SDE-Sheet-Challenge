import java.util.* ;
import java.io.*; 
public class Solution {
  public static String fourSum(int[] nums, int target, int n) {
      // Write your code here.
      List<List> result=new ArrayList<>();
      if(nums==null || nums.length<4){
          return "No";
      }
      Arrays.sort(nums);
      for(int i=0;i<n-3;i++){
          for(int j=i+1;j<n-2;j++){
              int low=j+1;
              int high=n-1;
              while(low<high){
                  int sum=nums[i]+nums[j]+nums[low]+nums[high];
                  if(sum==target){
                      List<Integer>list=new ArrayList<>();
                      list.add(nums[i]);
                      list.add(nums[j]);
                      list.add(nums[low]);
                      list.add(nums[high]);
                      if(result.contains(list)==false){
                          result.add(list);
                      }
                      low++;
                      high--;
                      return "Yes";
                  }
                  else if(sum<target){
                      low++;
                  }
                  else{
                      high--;
                  }
              }
          }
      }
      return "No";
  }
}
