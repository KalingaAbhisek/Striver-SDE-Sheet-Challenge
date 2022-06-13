import java.util.*;
import java.math.BigInteger;
public class Solution 
{
    public static int compareVersions(String a, String b) 
    {
        // Write your code here
        String[] arr=a.split("\\.");
        String[] arr1=b.split("\\.");
        int max=Math.max(arr.length,arr1.length);
        for(int i=0;i<max;i++){
            String num1=(i<arr.length)?arr[i]:"0";
            String num2=(i<arr1.length)?arr1[i]:"0";
            BigInteger b1=new BigInteger(num1);
            BigInteger b2=new BigInteger(num2);
            if(b1.compareTo(b2)==-1) return -1;
            if(b1.compareTo(b2)==1) return 1;
        }
        return 0;
    }
}
