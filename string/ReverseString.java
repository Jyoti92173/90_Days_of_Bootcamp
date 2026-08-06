package string;

import java.util.Arrays;

public class ReverseString {
    public void reverseString(char[] s){
    int n =  s.length;
    char[] temp = new char[n];
    int j = 0;
        
        for (int i = s.length - 1; i >= 0; i--) {
            temp[j] = s[i];
            j++;
        }

        // Copy back to original array
        for (int i = 0; i < s.length; i++) {
            s[i] = temp[i];
        }

    }
    public static void main(String[] args) {

        char[] s = {'h', 'e', 'l', 'l', 'o'};

        ReverseString r = new ReverseString();

        r.reverseString(s);

        System.out.println(Arrays.toString(s));
    }
}
