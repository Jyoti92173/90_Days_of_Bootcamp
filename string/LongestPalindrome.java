// Problem Statement : Given a string s, return the longest palindromic substring in s.
//  Example 1:
//  Input: s = "babad"
//  Output: "bab"
//  Explanation: "aba" is also a valid answer.
//  Example 2:
//  Input: s = "cbbd"
//  Output: "bb"

package string;

public class LongestPalindrome {
    // Brute Force Approach..........
    public String longestPalindrome(String s) {
        int maxLength = 0;
        String result = "";
        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                String substring = s.substring(i, j+1);
                if(isPalindrome(substring) && substring.length()>maxLength){
                    result = substring;
                    maxLength = substring.length();
                }
            }
        }
        return result;
    }
    private boolean isPalindrome(String s){
        int left = 0;;
        int right = s.length()-1;
        while(left < right){
            if(s.charAt(left++) != s.charAt(right--)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        LongestPalindrome lp = new LongestPalindrome();
        System.out.println("Brute Force Approach : " + lp.longestPalindrome("babad"));
    }
}
