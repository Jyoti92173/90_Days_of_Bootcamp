// Problem Statement :Given a non-negative integer c,decide whether there are two integers a and b such that a2 + b2 = c.

package Math;

public class SumOfSquareNumber {
    // I used Brute Force Approach (if c is small number)..........
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

    // Two Pointer Approach..
    public boolean judgeSquareSum1(int c) {
        long left = 0, right = (long) Math.sqrt(c);
        while (left <= right) {
            long cur = left * left + right * right;
            if (cur < c) {
                left++;
            } else if (cur > c) {
                right--;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int c = 5;
        SumOfSquareNumber s = new SumOfSquareNumber();
        System.out.println("Brute Force Approach : "+ s.judgeSquareSum(c));
        int c1 = 3;
        System.out.println("Two Pointer Approach : " + s.judgeSquareSum1(c1));
    }
}
