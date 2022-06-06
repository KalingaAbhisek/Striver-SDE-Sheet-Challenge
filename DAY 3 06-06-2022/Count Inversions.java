import java.util.* ;
import java.io.*; 
public class Solution {
    static long count=0;
    public static long getInversions(long arr[], int n) {
        // Write your code here.
        mergesort(arr,0,n-1);
        return count;
        
    }
    public static void merge(long arr[], int start, int mid , int high){
        int n1=mid-start+1;
        int n2=high-mid;
      long left[]=new long[n1];
        long right[]=new long[n2];
        for(int i=0;i<n1;i++){
            left[i]=arr[start+i];
        }
        for(int i=0;i<n2;i++){
            right[i]=arr[mid+i+1];
        }
        int i=0,j=0,k=start;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k++]=left[i];
                i++;
            }
            else{
                arr[k++]=right[j];
                j++;
                count+=(n1-i);
            }
        }
        while(i<n1){
            arr[k++]=left[i];
            i++;
        }
        while(j<n2){
            arr[k++]=right[j];
            j++;
        }
        
    }
    public static void mergesort(long[] arr, int start, int end){
        if(start<end){
            int mid=(start+end)/2;
            mergesort(arr,start,mid);
            mergesort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }
    }
}
