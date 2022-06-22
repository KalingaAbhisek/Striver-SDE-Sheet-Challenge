import java.util.*;
public class Solution
{
    public static int jobScheduling(int[][] jobs)
    {
        // Write your code here
        Arrays.sort(jobs,(a,b)->b[1]-a[1]);
        int maxDeadline=0;
        for(int i=0;i<jobs.length;i++){
            maxDeadline=Math.max(maxDeadline,jobs[i][0]);
        }
        int temp[]=new int[maxDeadline+1];
        for(int i=1;i<temp.length;i++){
            temp[i]=-1;
        }
        int maxprof=0;
        for(int i=0;i<jobs.length;i++){
            for(int j=jobs[i][0];j>0;j--){
                if(temp[j]==-1){
                    temp[j]=temp[j]+1;
                    maxprof+=jobs[i][1];
                    break;
                }
            }
        }
        return maxprof;
    }
}
