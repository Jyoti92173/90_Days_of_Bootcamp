// Problem Statement : Given an integer n, return true if it is a power of three. Otherwise, return false.
// An integer n is a power of three, if there exists an integer x such that n == 3x.

package Math;

public class PowerOfThree {
    public boolean isPowerOfThree(int x) {
        if (x == 1) {
            return true;
        }
        if (x <= 0 || x % 3 != 0) {
            return false;
        }
        return isPowerOfThree(x / 3);
    }

    public static void main(String[] args) {
        int x = 81;
        PowerOfThree p = new PowerOfThree();
        System.out.println(p.isPowerOfThree(81));
    }
}
