package leetcode.datastructures;

import java.util.*;

// TODO - finish
// https://leetcode.com/problems/valid-parentheses/
public class ValidParentheses {
    public static void main(String[] args) {
            List<List<Integer>> list = new ArrayList<>();
            list.add(new ArrayList<>());
            list.get(0).add(5);
            list.get(0).get(0);
        System.out.println(isValid("()[]{}"));
        System.out.println("\nNew Call");
        System.out.println(isValid("()"));
        System.out.println("\nNew Call");
        System.out.println(isValid("(]"));
        System.out.println("\nNew Call");
        System.out.println(isValid("([)]"));
        System.out.println("\nNew Call");
        System.out.println(isValid("([])"));
        System.out.println("\nNew Call");
        System.out.println(isValid("(("));
    }

    public static boolean isValid(String s) {
        if(s.length() % 2 != 0) {
            return false;
        }
        if(isClosing(s, 0)) {
            return false;
        }
        int index = 0;
        while (!s.isEmpty()) {
            char opening = s.charAt(index);
            //System.out.println(s);
            // bug here fix this
            if(index == s.length() - 1 && !isClosing(s, index + 1)) {
                //System.out.println("Got here");
                return false;
            }
            if(!isClosing(s, index + 1)) {
                //System.out.println("Found new opening");
                index++;
                opening = s.charAt(index);
            } else {
                //System.out.println("Inside else " + s);
                //System.out.println(opening);
                if(opening == '(' && s.charAt(index + 1) == ')') {
                    //System.out.println("True with (");
                    s = resizeString(s, index);
                } else if(opening == '[' && s.charAt(index + 1) == ']') {
                    //System.out.println("True with [");
                    s = resizeString(s, index);
                } else if(opening == '{' && s.charAt(index + 1) == '}') {
                    //System.out.println("True with {");
                    s = resizeString(s, index);
                } else {
                    //System.out.println("Got here it failed all of the else if");
                    return false;
                }
                index = 0;
            }
        }
        return true;
    }

    private static String resizeString(String s, int index) {
        String temp = s.substring(0, index);
        //System.out.println("Temp: " + temp);
        s = s.substring(index + 2);
        //System.out.println("S: " + s);
        s = temp + s;
        return s;
    }

    public static boolean isClosing(String s, int index) {
        return s.charAt(index) == ')' || s.charAt(index) == '}' || s.charAt(index) == ']';
    }

    public static Deque<String> createStack(String s) {
        Deque<String> deque = new ArrayDeque<>();
        int index = 0;
        while (index < s.length()) {
            if(s.charAt(index) == '(') {
                deque.push(s.charAt(index) + "");
            }
            if(s.charAt(index) == '{') {
                deque.push(s.charAt(index) + "");
            }
            if(s.charAt(index) == '[') {
                deque.push(s.charAt(index) + "");
            }
            index++;
        }
        return deque;
    }
}
