import java.util.*;
public class Solution {
	public static String longestCommonPrefix(String[] arr, int n) {
		// Write your code here
    String res="";
    if(arr.length==0)
        return "";
    if(arr.length==1)
        return arr[0]; 
    Arrays.sort(arr);
    int min=Math.min(arr[0].length(), arr[arr.length-1].length());
    int i=0;
    while(i<min && (arr[0].charAt(i)==arr[arr.length-1].charAt(i))) {
        i++;
    }
    res=arr[0].substring(0,i);
    return res;
	}

}
