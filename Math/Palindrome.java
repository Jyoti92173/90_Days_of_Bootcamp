package Math;

public class Palindrome {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int temp = x;
        int rev = 0;

        while (temp > 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
        }

        return rev == x;
    }
    public static void main(String[] args) {
        int x = 121;
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome(x));
    }
}
