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
