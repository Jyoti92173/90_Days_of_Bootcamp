// Problem Statement : You are given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
//
//You must not use any built-in exponent function or operator.
//
//For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.


package binarySearch;

public class Sqrt {
    public int mySqrt1(int x) {
        if(x==0){
            return 0;
        }

        int res = 1;
        for (int i = 1; i <= x; i++) {
            if ((long) i * i > x) {
                return res;
            }
            res = i;
        }

        return res;
    }

    public int mySqrt(int x) {
        int l = 0, r = x;
        int res = 0;

        while (l <= r) {
            int m = l + (r - l) / 2;
            if ((long) m * m > x) {
                r = m - 1;
            } else if ((long) m * m < x) {
                l = m + 1;
                res = m;
            } else {
                return m;
            }
        }

        return res;
    }



    public static void main(String[] args) {
        int x = 9;
        Sqrt sqrt = new Sqrt();
        System.out.println(sqrt.mySqrt(x));
        System.out.println(sqrt.mySqrt1(x));
    }
}
