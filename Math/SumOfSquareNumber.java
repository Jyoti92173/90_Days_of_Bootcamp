package Math;

public class SumOfSquareNumber {
    // I used Brute Force Approach (if c is small number)
    public boolean judgeSquareSum(int c) {
        for(long a = 0; a*a <= c; a++){
            for(long b = 0; b*b <= c; b++){
                if(a*a + b*b == c){
                    return true;
                }
            }
        }
        return false;

    }
    public static void main(String[] args) {
        int c = 5;
        SumOfSquareNumber s = new SumOfSquareNumber();

        System.out.println("Brute Force Approach : "+ s.judgeSquareSum(c));
    }
}
