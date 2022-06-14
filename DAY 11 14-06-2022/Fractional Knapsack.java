/****************************************************************

    Following is the class structure of the Pair class:

        class Pair
        {
        	int weight;
	        int value;
	        Pair(int weight, int value)
	        {
		        this.weight = weight;
		        this.value = value;
	        }
	        
        }
        
*****************************************************************/
import java.util.*;
class itemcmp implements Comparator<Pair>{
    public int compare(Pair a,Pair b){
        double n1=(double)(a.value)/(double)(a.weight);
        double n2=(double)(b.value)/(double)(b.weight);
        if(n1<n2)
            return 1;
        else if(n1>n2)
            return -1;
        else
            return 0;
    }
}
public class Solution {
    public static double maximumValue(Pair[] items, int n, int w) {
            // Write your code here.
    	    // ITEMS contains {weight, value} pairs.
        Arrays.sort(items,new itemcmp());
        int currweight=0;
        double finalvalue=0;
        for(int i=0;i<n;i++){
            if(currweight+items[i].weight<=w){
                currweight+=(items[i].weight);
                finalvalue+=(items[i].value);
            }
            else{
                int remain=w-currweight;
                finalvalue+=((double)items[i].value/(double)items[i].weight)*remain;
                break;
            }
        }
        return finalvalue;
    }
}
