import java.util.*;
public class Queue {
    // Define the data members(if any) here.
    Stack<Integer> input;
    Stack<Integer> output;

    Queue() {
        // Initialize your data structure here.
        input=new Stack<>();
        output=new Stack<>();
    }

    void enQueue(int val) {
        // Implement the enqueue() function.
        while(!input.isEmpty()){
            output.push(input.pop());
        }
        input.push(val);
        while(!output.isEmpty()){
            input.push(output.pop());
        }
    }

    int deQueue() {
        // Implement the dequeue() function.
        if(!input.isEmpty()){
            return input.pop();
        }
        return -1;
    }

    int peek() {
        // Implement the peek() function here.
        if(!input.isEmpty()){
            return input.peek();
        }
        return -1;
    }

    boolean isEmpty() {
        // Implement the isEmpty() function here.
        return input.isEmpty();
    }
}
