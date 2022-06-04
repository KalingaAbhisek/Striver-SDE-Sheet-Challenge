import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
                 // Write your code here.
        int count=0;
        ArrayList<ArrayList<Long>> res= new ArrayList<>();
        for(int i=0;i<n;i++){
            ArrayList<Long> singlelist = new ArrayList<>();
            for(int j=0;j<i+1;j++){
                if(j==0 || j==i)
                    singlelist.add(1l);
                else
                    singlelist.add(j,res.get(i-1).get(j-1)+res.get(i-1).get(j));
            }
            res.add(singlelist);
        }
        return res;
	}
}
