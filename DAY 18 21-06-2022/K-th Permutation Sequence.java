import java.util.ArrayList;

public class Solution {
    public static String kthPermutation(int n, int k) {
        // Write your code here.
        ArrayList<Integer> num=new ArrayList<>();
        int fact=1;
        for(int i=1;i<n;i++){
            fact=fact*i;
            num.add(i);
        }
        num.add(n);
        String ans="";
        k=k-1;
        while(true){
            ans+=num.get(k/fact);
            num.remove(k/fact);
            k=k%fact;
            if(num.size()==0)
                break;
            fact=fact/num.size();
        }
        return ans;
    }
}
