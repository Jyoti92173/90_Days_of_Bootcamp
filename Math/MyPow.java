// Problem Statement : Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

package Math;

public class MyPow {
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
    public static void main(String[] args) {
        double x = 2.00000;
        int n = 5;
        MyPow mPow = new MyPow();
        System.out.println(mPow.myPow(x,n));
    }
}
