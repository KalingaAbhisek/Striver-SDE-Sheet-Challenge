import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static int uniqueSubstrings(String input) 
    {
		//write your code here
        int max=Integer.MIN_VALUE;
        HashSet<Character> hs=new HashSet<>();
        int left=0;
        for(int right=0;right<input.length();right++){
            while(left<right && hs.contains(input.charAt(right))){
                hs.remove(input.charAt(left));
                left++;
            }
            hs.add(input.charAt(right));
            max=Math.max(max,right-left+1);
        }
        return max;
	}
}
