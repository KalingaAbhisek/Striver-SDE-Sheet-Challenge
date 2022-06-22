import java.util.*;
import java.io.*;

public class Solution{
    static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> arr, int n){
        // Write your code here.
        ArrayList<Integer> res=new ArrayList<>(n);
        Stack<Integer> st=new Stack<>();
        st.push(-1);
        for(int i=n-1;i>=0;i--){
            while(st.peek()>=arr.get(i))
                st.pop();
            res.add(st.peek());
            st.push(arr.get(i));
        }
        Collections.reverse(res);
        return res;
    }
}
