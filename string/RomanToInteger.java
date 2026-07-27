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
