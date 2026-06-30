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

   // Two-Pointer approach......
    public static boolean isPalindrome1(String s){
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            // Skip non-alphanumeric characters from left
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            // Skip non-alphanumeric characters from right
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Compare ignoring case
            if (Character.toLowerCase(s.charAt(left)) !=
                    Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "Was it a car or a cat I saw?";

        System.out.println(ValidPalindrome.isPalindrome(s));
        System.out.println(ValidPalindrome.isPalindrome1(s));

    }


}
