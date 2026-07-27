// Problem Statement : Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
// Symbol       Value
// I             1
// V             5
// X             10
// L             50
// C             100
// D             500
// M             1000
// For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
// Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
// I can be placed before V (5) and X (10) to make 4 and 9.
// X can be placed before L (50) and C (100) to make 40 and 90.
// C can be placed before D (500) and M (1000) to make 400 and 900.
// Given a roman numeral, convert it to an integer.

package string;


import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanInteger(String s) {
        int prev =0, total = 0;
        for(int i = s.length()-1; i>=0; i--){
            int c = roman(s.charAt(i));
            if(c<prev){
                total = total -c;
            }else{
                total = total +c;
            }
            prev = c;
        }
        return total;
    }
    private int roman (char c){
        switch(c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }

    }

    // HashMap Approach..........
    public int romanToInt(String s) {
        Map<Character, Integer> romanValue = new HashMap<>();
        romanValue.put('I', 1);
        romanValue.put('V', 5);
        romanValue.put('X', 10);
        romanValue.put('L', 50);
        romanValue.put('C', 100);
        romanValue.put('D', 500);
        romanValue.put('M', 1000);

        int result = 0;
        int prev = 0;
        int curr;

        for (char roman : s.toCharArray()) {
            curr = romanValue.get(roman);
            result += (curr > prev) ? curr - 2 * prev : curr;
            prev = curr;
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(new RomanToInteger().romanInteger(s));

    }
}
