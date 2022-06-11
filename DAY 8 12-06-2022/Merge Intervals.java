import java.util.* ;
import java.io.*; 
/*******************************************************

    Following is the Interval class structure

    class Interval {
        int start, int finish;

        Interval(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
    }
    
*******************************************************/

import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static List<Interval> mergeIntervals(Interval[] intervals) {
        // write your code here.
        List<Interval> res=new ArrayList<>();
        int size=intervals.length;
        if(size==0)
            return res;
        Arrays.sort(intervals,(a,b)->a.start-b.start);
        for(int i=0;i<size;i++){
            int start=intervals[i].start;
            int end=intervals[i].finish;
            if(res.isEmpty() || res.get(res.size()-1).finish<start){
                res.add(new Interval(start,end));
            }
            else{
                Interval temp=new Interval(res.get(res.size()-1).start,Math.max(end,res.get(res.size()-1).finish));
                res.set(res.size()-1,temp);
            }
        }
        return res;
    }
}
