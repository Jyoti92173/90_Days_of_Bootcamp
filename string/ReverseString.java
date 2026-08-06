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

        int left=0,right=s.length-1;
        while(left<right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }

    }

    public void reverseString3(char[] s) {
        reverse(s, 0, s.length - 1);
    }

    private void reverse(char[] s, int left, int right) {
        if (left >= right) return;
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
        reverse(s, left + 1, right - 1);
    }
    public static void main(String[] args) {

        char[] s1 = {'h', 'e', 'l', 'l', 'o'};
        char[] s2 = {'h','e','l','l','o'};
        char[] s3 = {'b','a','n','a','n','a'};
        ReverseString r = new ReverseString();

        r.reverseString(s1);

        System.out.println("Brute Force Approach : " + Arrays.toString(s1));

        r.reverseString2(s2);
        System.out.println("Two Pointer: " + Arrays.toString(s2));

        r.reverseString3(s3);
        System.out.println("Recursive Approach: " + Arrays.toString(s3));
    }
}
