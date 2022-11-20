import java.util.*;

public class Solution {
    /**
     * @param s
     * @return
     */
    static String isBalanced(String s){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }
            else{
                if(stack.isEmpty()){
                    return "NO";
                } else {
                    char pop_val = stack.pop();
                    if(s.charAt(i)==')' && pop_val!='('){
                        return "NO";
                    }
                    if(s.charAt(i)=='}' && pop_val!='{'){
                        return "NO";
                    }
                    if(s.charAt(i)==']' && pop_val!='['){
                        return "NO";
                    }
                }
            }
        }
        if(stack.isEmpty()){
            return "YES";
        }
        return s;
    }

    /**
     * @param args
     */
    public static void main(String args[]){
        String str = isBalanced("[{})]");
        System.out.println(str);
    }
}
