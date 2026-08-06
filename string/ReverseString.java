// Problem Statement : Write a function that reverses a string. The input string is given as an array of characters s.
// You must do this by modifying the input array in-place with O(1) extra memory.


package string;

import java.util.Arrays;

public class ReverseString {
    // Brute Force Approach........
    public void reverseString(char[] s){
    int n =  s.length;
    char[] temp = new char[n];
    int j = 0;

        // Copy in reverse order
        for (int i = s.length - 1; i >= 0; i--) {
            temp[j] = s[i];
            j++;
        }

        // Copy back to original array
        for (int i = 0; i < s.length; i++) {
            s[i] = temp[i];
        }

    }
    // Two-Pointer Approach..........

    public void  reverseString2(char[] s){
        int n = s.length;
       int start = 0;
       int end = n-1;
       while(start < end){
           char temp = s[start];
           s[start] = s[end];
           s[end] = temp;
           start++;
           end--;
       }

    }
    public static void main(String[] args) {

        char[] s = {'h', 'e', 'l', 'l', 'o'};

        ReverseString r = new ReverseString();

        r.reverseString(s);

        System.out.println("Brute Force Approach : " + Arrays.toString(s));

        r.reverseString2(s);

        System.out.println("Two-Pointer Approach : " +Arrays.toString(s));
    }
}
