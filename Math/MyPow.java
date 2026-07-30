// Problem Statement : Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

package Math;

public class MyPow {
    // Brute Force Approach................
    public double myPow(double x, int n) {
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        double result = 1;
        for(int i =0; i<Math.abs(n);i++){
            result *=x;
        }
        return n>=0 ? result:1 /result;
    }
// Binary Exponentiation Approach...............

    public double myPow1(double x, int n) {
        if (x == 0) return 0;
        if (n == 0) return 1;

        double res = 1;
        long power = Math.abs((long)n);

        while (power > 0) {
            if ((power & 1) == 1) {
                res *= x;
            }
            x *= x;
            power >>= 1;
        }
        return n >= 0 ? res : 1 / res;
    }
    public static void main(String[] args) {
        double x = 2.00000;
        int n = 5;
        MyPow mPow = new MyPow();
        System.out.println("Binary Force :" + mPow.myPow(x,n));
        int m = -3;
        System.out.println("Binary Exponentiation :" + mPow.myPow1(x,m));
    }
}
