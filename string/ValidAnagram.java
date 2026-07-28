package string;

import java.util.Arrays;

public class ValidAnagram {
// Brute Force - Sort and Compare Approach.........
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        return  Arrays.equals(sArray, tArray);
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        ValidAnagram validAnagram = new ValidAnagram();
        System.out.println(validAnagram.isAnagram(s,t));

    }
}
