import java.util.*;
class Meeting{
    int pos,start,end;
    Meeting(int a,int b,int c){
        pos=a;
        start=b;
        end=c;
    }
}
class sortbyend implements Comparator<Meeting>{
    public int compare(Meeting a,Meeting b){
        return a.end-b.end;
    }
}
public class Solution {
    public static List<Integer> maximumMeetings(int[] start, int[] end) {        
        //Write your code here
        ArrayList<Meeting> allmeets=new ArrayList<>();
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<start.length;i++){
            allmeets.add(new Meeting(i+1,start[i],end[i]));
        }
        Collections.sort(allmeets,new sortbyend());
        res.add(allmeets.get(0).pos);
        int check=allmeets.get(0).end;
        for(int i=1;i<allmeets.size();i++){
            if(check<allmeets.get(i).start){
                res.add(allmeets.get(i).pos);
                check=allmeets.get(i).end;
            }
        }
        return res;
        
    }
}
