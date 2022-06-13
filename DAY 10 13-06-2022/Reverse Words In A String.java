import java.util.*;
import java.io.*;
public class Solution 
{
	public static String reverseString(String str) 
	{
		//Write your code here\
        String[] strarr=str.trim().split("\\s+");
        StringBuilder sb= new StringBuilder();
        for(int i=strarr.length-1;i>=1;i--)
            sb.append(strarr[i]+" ");
        sb.append(strarr[0]);
        return sb.toString();
	}
}
