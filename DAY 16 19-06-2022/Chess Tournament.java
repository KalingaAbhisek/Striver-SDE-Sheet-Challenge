import java.util.*;
public class Solution {

    public static int chessTournament(int[] positions, int n,  int c) 
	{
        // Write your code here.    
        Arrays.sort(positions);
        int start=0;
        int end=positions[n-1];
        int ans=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(isPossible(positions,n,c,mid)==true){
                ans=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
    public static boolean isPossible(int[] positions, int n,int c,int mid){
        int rooms=1;
        int placed=0;
        for(int i=1;i<n;i++){
            if(positions[i]-positions[placed]>=mid){
                rooms++;
                placed=i;
            }
            if(rooms>=c)
                return true;
        }
        return false;
    }

}
