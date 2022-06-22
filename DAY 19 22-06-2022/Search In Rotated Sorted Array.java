public class Solution {
    public static int search(int arr[], int key) {
        // Write your code here.
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key)
                return mid;
            else if(arr[mid]<=arr[end]){
                if(arr[mid]<key && arr[end]>=key)
                    start=mid+1;
                else
                    end=mid-1;
            }
            else{
                if(arr[start]<=key && arr[mid]>key)
                    end=mid-1;
                else
                    start=mid+1;
            }
        }
        return -1;
    }
}
