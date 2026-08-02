package stack;

public class ValidParenthesis {
    // Brute Force Approach..........
    public boolean isValid(String s) {
        while (s.contains("()") || s.contains("{}") || s.contains("[]")) {

            s = s.replace("()", "");
            s = s.replace("{}", "");
            s = s.replace("[]", "");
        }

        return s.isEmpty();
    }
    public static void main(String[] args) {
        String s = "([{}])";
        System.out.println(new ValidParenthesis().isValid(s));


    }
}
