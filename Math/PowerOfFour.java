// Problem Statement : Given an integer n, return true if it is a power of four. Otherwise, return false.
// An integer n is a power of four, if there exists an integer x such that n == 4x.


package Math;

public class PowerOfFour {
    public boolean isPowerOfFour(int n) {
        if(n==1){
            return true;
        }
        if(n<=0 || n%4!=0){
            return false;
        }
        return isPowerOfFour(n/4);
    }
    public static void main(String[] args) {
        int n = 16;
        PowerOfFour pf = new PowerOfFour();
        System.out.println(pf.isPowerOfFour(n));
    }
}
