import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    static Stack<int[]> st=new Stack<>();
    public static ArrayList<Integer> findSpans(ArrayList<Integer> price) {
        // Write your code here.
        {
            st=new Stack<>();
        }
        ArrayList<Integer> alist=new ArrayList<>();
        for(int i=0;i<price.size();i++){
            alist.add(span(price.get(i)));
        }  
        return alist;
    }
    public static int span(int val){
        int sp=1;
        while(!st.isEmpty() && st.peek()[0]<=val){
            sp+=st.pop()[1];
        }
        st.add(new int[]{val,sp});
        return sp;
    }
}
