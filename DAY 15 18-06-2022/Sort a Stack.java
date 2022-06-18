import java.util.*;
public class Solution {

	public static void sortStack(Stack<Integer> stack) {
		// Write your code here.
        Stack<Integer> x= new Stack<>();
        while(!stack.isEmpty()){
            int item=stack.pop();
            while(!x.isEmpty() && x.peek()<item) stack.push(x.pop());
            x.push(item);
        }
        while(!x.isEmpty())
            stack.push(x.pop());
	}

}
