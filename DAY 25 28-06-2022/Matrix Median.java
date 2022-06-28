import java.util.*;

public class Solution
{
	public static int getMedian(ArrayList<ArrayList<Integer>> matrix)
	{
		// Write your code here.
        ArrayList<Integer> arr=new ArrayList<>();
        int ans;
        for(int i=0;i<matrix.size();i++){
            for(int j=0;j<matrix.get(i).size();j++){
                arr.add(matrix.get(i).get(j));
            }
        }
        Collections.sort(arr);
        return arr.get(arr.size()/2);
	}
}
