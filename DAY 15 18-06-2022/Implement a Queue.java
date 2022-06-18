import java.util.*;
public class Queue {
    ArrayList<Integer> alist;
    Queue() {
        // Implement the Constructor
        alist=new ArrayList<>();
    }

    /*----------------- Public Functions of Queue -----------------*/

    boolean isEmpty() {
        // Implement the isEmpty() function
        if(alist.size()==0)
            return true;
        return false;
    }

    void enqueue(int data) {
        // Implement the enqueue() function
        alist.add(data);
    }

    int dequeue() {
        // Implement the dequeue() function
        if(alist.size()!=0){
            return alist.remove(0);
        }
        return -1;
    }

    int front() {
        // Implement the front() function
        if(alist.size()!=0)
            return alist.get(0);
        return -1;
    }

}
