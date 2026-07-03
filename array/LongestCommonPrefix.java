package array;

public class LongestCommonPrefix {
    // Brute-Force Approach..........
    
    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        String first = strs[0];
        StringBuilder prefix = new StringBuilder();

        // Traverse each character of first string
        for (int i = 0; i < first.length(); i++) {

            char ch = first.charAt(i);

            // Compare with all other strings
            for (int j = 1; j < strs.length; j++) {

                // If current string is shorter
                if (i >= strs[j].length()) {
                    return prefix.toString();
                }

                // Character mismatch
                if (strs[j].charAt(i) != ch) {
                    return prefix.toString();
                }
            }

            prefix.append(ch);
        }

        return prefix.toString();
    }

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] str = {"flower","flow","flight"}; 
        System.out.println(longestCommonPrefix.longestCommonPrefix(str));

    }
}
