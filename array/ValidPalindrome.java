package array;

public class ValidPalindrome {
    // brute-force approach.........
    public static boolean isPalindrome(String s){
        String cleaned = "";
        for(int i = 0; i<s.length(); i++ ) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                cleaned += Character.toLowerCase(ch);
            }
        }
        String reversed = "";

        for (int i = cleaned.length() - 1; i >= 0; i--) {
            reversed += cleaned.charAt(i);
        }

        // Step 3: Compare
        return cleaned.equals(reversed);
    }
//    public static boolean isPalindrome1(String s){
//
//    }

    public static void main(String[] args) {
        String s = "Was it a car or a cat I saw?";

        System.out.println(isPalindrome(s));

    }


}
