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
