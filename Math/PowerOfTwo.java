// Problem Statement : Given an integer n, return true if it is a power of two. Otherwise, return false.
//  An integer n is a power of two, if there exists an integer x such that n == 2x.

package Math;

public class PowerOfTwo {
    // Mathematical Approach........
    public boolean isPowerOfTwo(int x) {
        if(x==0){
            return false;
        }
        if(x==1){
            return true;
        }
        if(x%2!=0){
            return false;
        }else{
            return isPowerOfTwo(x/2);
        }
    }
    public static void main(String[] args) {
        int x = 16;
        PowerOfTwo p = new PowerOfTwo();
        System.out.println(p.isPowerOfTwo(x));
    }
}
