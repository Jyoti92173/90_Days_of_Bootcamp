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
