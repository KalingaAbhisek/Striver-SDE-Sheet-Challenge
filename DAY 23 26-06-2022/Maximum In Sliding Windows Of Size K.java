
import java.util.*;

public class Solution 
{

	public static ArrayList<Integer> getMaximumOfSubarrays(ArrayList<Integer> nums, int k) 
	{
		//	  Write your code here.
    ArrayList<Integer> v=new ArrayList<>();
    int j, max; 
   int n = nums.size();
    for (int i = 0; i <= n - k; i++) 
    { 
        max = nums.get(i); 

        for (j = 1; j < k; j++) 
        { 
            if (nums.get(i+j) > max) 
                max = nums.get(i+j); 
        } 
       v.add(max);   
    }   
    return v;
	}
}
