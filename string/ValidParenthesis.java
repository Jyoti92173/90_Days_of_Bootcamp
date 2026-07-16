package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {
    // Brute-Force Approach...........
    public boolean isValid(String s) {
        while (s.contains("()") || s.contains("{}") || s.contains("[]")) {
            s = s.replace("()", "");
            s = s.replace("{}", "");
            s = s.replace("[]", "");
        }
        return s.isEmpty();
    }

    public boolean isValid2(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> closeToOpen = new HashMap<>();
        closeToOpen.put(')', '(');
        closeToOpen.put(']', '[');
        closeToOpen.put('}', '{');

        for (char c : s.toCharArray()) {
            if (closeToOpen.containsKey(c)) {
                if (!stack.isEmpty() && stack.peek() == closeToOpen.get(c)) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "[]";
        ValidParenthesis p = new ValidParenthesis();
        System.out.println(p.isValid("()"));
        System.out.println(p.isValid("[]"));
        System.out.println(p.isValid("{}"));
        System.out.println(p.isValid("({[]})"));
        System.out.println(p.isValid("(]"));
        System.out.println(p.isValid("([)]"));


        System.out.println(p.isValid2("[]"));
        System.out.println(p.isValid2("([)]"));

    }
}
