import java.util.*;
public class Solution {
    public static boolean isValidParenthesis(String s) {
        // Write your code here.
        Stack <Character> str = new Stack <Character>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
                str.push(s.charAt(i));
            else{
                if(str.isEmpty()==true)
                    return false;
                else if(matching(str.peek(),s.charAt(i))==false)
                    return false;
                else
                    str.pop();
            }
        }
        return (str.isEmpty()==true);
    }
    public static boolean matching(char a, char b){
        return ((a=='(' && b==')') || (a=='{' && b=='}') || (a=='[' && b==']'));
    }
}
