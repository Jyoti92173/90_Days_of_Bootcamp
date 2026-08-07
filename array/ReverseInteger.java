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
        System.out.println("Mathematical Approach: " +  r.reverse(x));
    }
}
