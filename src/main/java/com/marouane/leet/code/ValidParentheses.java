package com.marouane.leet.code;

import java.util.ArrayDeque;

public class ValidParentheses {

    public static boolean isValid(String s) {
        var stk = new ArrayDeque<Character>();

        for (char c : s.toCharArray()) {
            //(])

            if ('(' == c || '[' == c || '{' == c) {
                stk.push(c);
            } else {
                var cc = stk.peek();
                if (cc == null)
                    return false;
                if (isClosing(cc, c)) {
                    stk.pop();
                }else {
                    break;
                }
            }

        }

        return stk.isEmpty();
    }

    private static boolean isClosing(char c1, char c2) {
        return c1 == '(' && c2 == ')'
                || c1 == '[' && c2 == ']'
                || c1 == '{' && c2 == '}';
    }
}
