public class Solution
{
public static int findMinimumCoins(int amount)
    {
        // Write your code here.
    int cnt=0;
      int[] arr={1,2,5,10,20,50,100,500,1000};
      for(int i=arr.length-1;i>=0;i--){
          if(amount/arr[i]>=1){
              cnt+=amount/arr[i];
              amount=amount%arr[i];
          }
          if(amount==0)
              break;
      }
    return cnt;
    }
}
