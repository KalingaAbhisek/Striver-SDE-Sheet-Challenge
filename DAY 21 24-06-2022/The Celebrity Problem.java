/*
	This is signature of helper function 'knows'.
	You should not implement it, or speculate about its implementation.

	boolean knows(int A, int B); 
	Function 'knows(A, B)' will returns "true" if the person having
	id 'A' know the person having id 'B' in the party, "false" otherwise.
	Use it as Runner.knows(A, B);
*/
	
import java.util.*;
public class Solution {
	public static int findCelebrity(int n) {
        // Write your code here.
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<n;i++)
        {
            s.push(i);
        }
        while(s.size()>1){
            int a = s.pop();
            int b = s.pop();
            if(Runner.knows(a,b)){
                s.push(b);
            }
            else
            {
                s.push(a);
            }
        }
        if(!s.empty()){
        int ans = s.peek();
        int count =0;
        for(int i=0;i<n;i++){
            if(Runner.knows(ans,i)==true)//row check
                return -1;
        }
        for(int i = 0;i<n;i++)
        {
            if(Runner.knows(i,ans)==true){//column check
                count++;    
            }
        }
            if(count>=1)
                return ans;
        }
        return -1;       
    }
}
