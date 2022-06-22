import java.util.*;
public class Solution {
	
	public static int[] nextGreater(int[] arr, int n) {	
		//Write Your code here
        int[] res=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            if(st.isEmpty())
                res[i]=-1;
            else if(st.peek()>arr[i])
                res[i]=st.peek();
            else{
                while(!st.isEmpty() && st.peek()<=arr[i])
                    st.pop();
                if(st.isEmpty())
                    res[i]=-1;
                else
                    res[i]=st.peek();
            }
            st.push(arr[i]);
        }
        return res;
	}

}
