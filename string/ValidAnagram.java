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
// Count Character Approach...........
    public boolean isAnagram2(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] count = new int[26];
        for(int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for(int i = 0; i < count.length; i++){
            if(count[i] != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        ValidAnagram validAnagram = new ValidAnagram();
        System.out.println("Brute Force-Sort and Compare Approach: "+ validAnagram.isAnagram(s,t));
        System.out.println("Count Character Approach: "+ validAnagram.isAnagram2(s,t));

    }
}
