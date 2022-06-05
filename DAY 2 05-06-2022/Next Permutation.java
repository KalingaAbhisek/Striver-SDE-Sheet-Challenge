import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

public class Solution 
{
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) 
	{
		// Write your code here.
        int i=permutation.size()-2;
        while(i>=0 && (permutation.get(i+1)<=permutation.get(i))){
                i--;
        }
        if(i>=0){
            int j=permutation.size()-1;
            while(permutation.get(j)<=permutation.get(i))
                j--;
            Collections.swap(permutation,i,j);
        }
        int start =i+1;
        int end = permutation.size()-1;
        while(start<end){
            Collections.swap(permutation,start++,end--);
        }
        return permutation;
    }
}
