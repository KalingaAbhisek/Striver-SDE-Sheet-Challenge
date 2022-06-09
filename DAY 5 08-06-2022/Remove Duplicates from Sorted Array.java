import java.util.*;
import java.io.*;
public class Solution {
	public static int removeDuplicates(ArrayList<Integer> arr,int n) {
		// Write your code here.
        int cnt=0;
        for(int i=1;i<n;i++){
            if(arr.get(i)==arr.get(i-1))
                cnt++;
            else
                arr.set((i-cnt),arr.get(i));
        }
        return n-cnt;
	}
}
