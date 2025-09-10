package LeetCode.Easy;
// Valid Parentheses

import java.util.Stack;

public class LeetCode20 {
    public static void main(String[] args) {
        String s = "((";
        System.out.println(isValid(s));
    }
    
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        if (s.isEmpty()) return false;
        for (char c : s.toCharArray()){
            if (c=='(' || c== '[' || c == '{'){
                st.push(c);
            }else {
                if (st.isEmpty()) return false;
                if (c==')' && st.pop() != '(') return false;
                if (c==']' && st.pop() != '[') return false;
                if (c=='}' && st.pop() != '{') return false;
            }
        }
        return st.isEmpty();
    }
}