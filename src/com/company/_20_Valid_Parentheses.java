package com.company;

import java.util.Stack;

public class _20_Valid_Parentheses {
    public boolean isValid(String s) {
        Stack<Character> stk1 = new Stack<>();

        for (char bracket : s.toCharArray()) {
            if (bracket == '(' || bracket == '[' || bracket == '{') {
                stk1.push(bracket);
            } else {
                if (stk1.isEmpty()) {
                    return false;
                }
                char top = stk1.pop();
                if ((bracket == ')' && top != '(') ||
                        (bracket == ']' && top != '[') ||
                        (bracket == '}' && top != '{')) {
                    return false;
                }
            }
        }

        // If the stack is empty, all opening brackets had matching closing brackets
        return stk1.isEmpty();
    }

    public static void main(String[] args) {
        _20_Valid_Parentheses obj = new _20_Valid_Parentheses();
        System.out.println(obj.isValid("()[]{}")); // Output: true
        System.out.println(obj.isValid("(]"));     // Output: false
        System.out.println(obj.isValid("([)]"));   // Output: false
        System.out.println(obj.isValid("{[]}"));   // Output: true
    }
}
