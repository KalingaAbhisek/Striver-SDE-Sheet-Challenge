public class Solution {	
	public static String longestPalinSubstring(String str) {
		// Write your code here.
        if(str.length()==1)
            return str;
        String res=str.substring(0,1);
        for(int i=0;i<str.length();i++){
            String tempstr=palihelp(str,i,i);
            if(tempstr.length()>res.length())
                res=tempstr;
            tempstr=palihelp(str,i,i+1);
            if(tempstr.length()>res.length())
                res=tempstr;
        }
        return res;
	}
    public static String palihelp(String str,int begin,int end){
        while((begin>=0 && end<=str.length()-1) &&(str.charAt(begin)==str.charAt(end))){
            end++;
            begin--;
        }
        return str.substring(begin+1,end);
    }
}
