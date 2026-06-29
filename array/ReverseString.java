package array;

import java.util.Arrays;

public class ReverseString {
    // brute force approach....
    public static void reverseString(char[] s){
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
    public static void main(String[] args) {
        char[] s = {'n', 'e', 'e', 't'};

        reverseString(s);

        System.out.println(Arrays.toString(s));
    }
}
