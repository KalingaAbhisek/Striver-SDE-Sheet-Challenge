import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    public static void rotateMatrix(ArrayList<ArrayList<Integer>> mat, int n, int m) {
        // Write your code here.
         int up=0,down=n-1,left=0,right=m-1;
        if(down==0 || right==0)
            return;
        while(up<down && left<right){
            int temp=mat.get(up).get(up);
            for(int i=left+1;i<=right;i++){
                int temp1=mat.get(up).get(i);
                mat.get(up).set(i,temp);
                temp=temp1;
            }
            for(int i=up+1;i<=down;i++){
                int temp1=mat.get(i).get(right);
                mat.get(i).set(right,temp);
                temp=temp1;
            }
            for(int i=right-1;i>=left;i--){
                int temp1=mat.get(down).get(i);
                mat.get(down).set(i,temp);
                temp=temp1;
            }
            for(int i=down-1;i>=up;i--){
                int temp1=mat.get(i).get(left);
                mat.get(i).set(left,temp);
                temp=temp1;
            }
            up++;down--;left++;right--;
        }
    }
}
