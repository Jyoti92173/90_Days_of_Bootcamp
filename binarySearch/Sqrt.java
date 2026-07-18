package binarySearch;

public class Sqrt {
    public int mySqrt(int x) {
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

    public static void main(String[] args) {
        int x = 9;
        Sqrt sqrt = new Sqrt();
        System.out.println(sqrt.mySqrt(x));

    }
}
