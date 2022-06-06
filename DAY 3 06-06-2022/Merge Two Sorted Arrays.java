import java.util.* ;
import java.io.*; 
public class Solution {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        // Write your code here.
        int merge[]=new int[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(arr1[i]<=arr2[j]){
                merge[k++]=arr1[i];
                i++;
            }
            else{
                merge[k++]=arr2[j];
                j++;
            }
        }
        while(i<m){
            merge[k++]=arr1[i];
            i++;
        }
        while(j<n){
            merge[k++]=arr2[j];
            j++;
        }
        return merge;
    }
}
