// Problem Statement : You are given an array of characters which represents a string s. Write a function which reverses a string.
// You must do this by modifying the input array in-place with O(1) extra memory.

package array;
import java.util.Arrays;
import java.util.Stack;


public class ReverseString {

    // Brute Force
    public static void reverseString(char[] s) {

        int n = s.length;
        char[] temp = new char[n];

        int index = 0;

        for (int i = n - 1; i >= 0; i--) {
            temp[index++] = s[i];
        }

        for (int i = 0; i < n; i++) {
            s[i] = temp[i];
        }
    }

    // Two Pointer
    public static void reverseStringUsingTwoPointer(char[] s) {

        int left = 0;
        int right = s.length - 1;

        while (left < right) {

            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    // Stack Approach............

    public static void reverseStringUsingStack(char[] s ){

        Stack<Character> stack = new Stack<>();
        for(char c : s){
            stack.push(c);
        }

        int i = 0;
        while (!stack.isEmpty()){
            s[i++] = stack.pop();
        }
    }

    public static void reverseStringUsingRecursion(char[] s) {
        reverse(s, 0, s.length - 1);
    }

    private static void reverse(char[] s, int l, int r) {
        if (l < r) {
            reverse(s, l + 1, r - 1);
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
        }
    }


    public static void main(String[] args) {

        char[] s1 = {'n','e','e','t'};
        reverseString(s1);
        System.out.println("Brute Force: " + Arrays.toString(s1));

        char[] s2 = {'n','e','e','t'};
        reverseStringUsingTwoPointer(s2);
        System.out.println("Two Pointer: " + Arrays.toString(s2));

        char[] s3 = {'n','e','e','t'};
        reverseStringUsingRecursion(s3);
        System.out.println("Recursion: " + Arrays.toString(s3));

        char[] s4 = {'n','e','e','t'};
        reverseStringUsingStack(s4);
        System.out.println("Stack: " + Arrays.toString(s4));

    }
}