import java.util.*;
public class Stack {

    // Define the data members.
    Queue<Integer> qu;

    public Stack() {
        // Implement the Constructor.
        qu=new LinkedList<>();
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() { 
        // Implement the getSize() function.
        return qu.size();

    }

    public boolean isEmpty() {
        // Implement the isEmpty() function.
        return qu.isEmpty();
    }

    public void push(int element) {
        // Implement the push(element) function.
        qu.add(element);
        for(int i = 0;i<qu.size()-1;i++) {
            qu.add(qu.remove());
        }
    }

    public int pop() {
        // Implement the pop() function.
        if(!qu.isEmpty())
            return qu.remove();
        return -1;
    }

    public int top() {
        // Implement the top() function.
        if(!qu.isEmpty())
            return qu.peek();
        return -1;
    }
}
