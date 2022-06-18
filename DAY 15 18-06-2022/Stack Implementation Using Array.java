import java.util.*;
public class Stack {
    int arr[];
    int i;
    Stack(int capacity){
        arr=new int[capacity];
        i=-1;
    }
    void push(int num) {
        // Write your code here.
        if(i<arr.length-1){
            arr[++i]=num;
        }
    }
    int pop() {
        // Write your code here.
        if(i!=-1){
            int popp=arr[i--];
            return popp;
        }
        return -1;
    }
    int top() {
        // Write your code here.
        if(i!=-1 && i<arr.length)
            return arr[i];
        return -1;
    }
    int isEmpty() {
        // Write your code here.
        if(i==-1)
            return 1;
        return 0;
    }
    int isFull() {
        // Write your code here.
        if(i>=arr.length){
            return 1;
        }
        return 0;
    }
}
