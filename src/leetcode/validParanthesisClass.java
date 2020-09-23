package leetcode;

import java.util.Stack;

public class validParanthesisClass {
    public boolean isValid(String s) {
        Stack<Character> inputStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                inputStack.push(ch);
            } else if ((ch == ')' || ch == ']' || ch == '}') && !inputStack.isEmpty()) {
                if (((inputStack.peek() == '(' && ch == ')') || inputStack.peek() == '{' && ch == '}') || inputStack.peek() == '[' && ch == ']') {
                    inputStack.pop();
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        if (inputStack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args){
        validParanthesisClass object = new validParanthesisClass();
        boolean result = object.isValid("()[]{}");
        System.out.println(result);
    }
}
