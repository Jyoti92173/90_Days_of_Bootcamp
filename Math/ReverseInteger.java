// Problem Statement : Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
//Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

package Math;

public class ReverseInteger {
    // Mathematics Approach.........
    public int reverseInteger(int number){
        long reversedNumber = 0;
        while(number!=0){
            long remainder =  number%10;
            reversedNumber = reversedNumber * 10 + remainder;
            number/=10;
        }
        if(reversedNumber>Integer.MAX_VALUE || reversedNumber<Integer.MIN_VALUE){
            return 0;
        }
        return (int)reversedNumber;
    }
    public static void main(String[] args){
        int number = 321;
        System.out.println(new ReverseInteger().reverseInteger(number));

    }
}
