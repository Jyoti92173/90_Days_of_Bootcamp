package string;



public class LongestPalindrome {
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
