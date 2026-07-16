package string;

public class ValidParenthesis {
    public boolean isValid(String s) {
        while (s.contains("()") || s.contains("{}") || s.contains("[]")) {
            s = s.replace("()", "");
            s = s.replace("{}", "");
            s = s.replace("[]", "");
        }
        return s.isEmpty();
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

    }
}
