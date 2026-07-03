// Problem Statement : You are given an array of strings strs. Return the longest common prefix of all the strings.
//
//If there is no longest common prefix, return an empty string "".
package array;

import java.util.Arrays;

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
    // Sorting Approach.....
    public String longestCommonPrefix1(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }

        Arrays.sort(strs);
        int N = Math.min(strs[0].length(), strs[strs.length - 1].length());
        for (int i = 0; i < N; i++) {
            if (strs[0].charAt(i) != strs[strs.length - 1].charAt(i)) {
                return strs[0].substring(0, i);
            }
        }
        return strs[0];
    }

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

        String[] str = {"flower","flow","flight"}; 
        System.out.println(longestCommonPrefix.longestCommonPrefix(str));

        String[] str1 = {"bat","bag","bank","band"};
        System.out.println(longestCommonPrefix.longestCommonPrefix1(str1));

    }
}
