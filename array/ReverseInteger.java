// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
//
//Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

package array;

public class ReverseInteger {
    public int reverse(int x) {
        long reverse = 0;
        while (x != 0) {
            int remainder =  x % 10;
            reverse = reverse * 10 + remainder;
            x /= 10;
        }
        if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) reverse;
    }
    public static void main(String[] args) {
        int x = 123;
        ReverseInteger r = new ReverseInteger();
        System.out.println("Mathematical Approach : " +  r.reverse(x));

        int y = -123;
        ReverseInteger r2 = new ReverseInteger();
        System.out.println("Mathematical Approach : " +  r2.reverse(y));
    }
}
