package string;


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

    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(new RomanToInteger().romanInteger(s));

    }
}
