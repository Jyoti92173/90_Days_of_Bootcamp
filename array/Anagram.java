// Problem Statement : Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.
// An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.


package array;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    // brute force approach.............
    public static boolean hasDuplicate(String s, String t) {
        if(s.length()!=t.length()) return false;

        boolean[] ans = new boolean[t.length()];

        for(int i = 0; i< s.length(); i++) {
            boolean found = false;
            for(int j = 0; j< t.length(); j++) {
                if(!ans[j] && s.charAt(i)==t.charAt(j)) {
                    ans[j] = true;
                    found = true;
                    break;
                }
            }
            if(!found) return false;
        }
        return true;
    }
    public static boolean hasDuplicateUsingMap(String s, String t) {
        // Using HashMap approach............
        if(s.length()!=t.length()) return false;

        Map<Character , Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : t.toCharArray()) {

            if (!map.containsKey(ch)) {
                return false;
            }

            map.put(ch, map.get(ch) - 1);

            if (map.get(ch) == 0) {
                map.remove(ch);
            }
        }
        return map.isEmpty();
    }

    static void main() {
        String s = "racecar";
        String t = "carrace";
        System.out.println(hasDuplicate(s, t));
        System.out.println(hasDuplicateUsingMap(s, t));

    }
}
