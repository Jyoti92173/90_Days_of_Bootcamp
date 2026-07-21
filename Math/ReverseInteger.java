package Math;

public class ReverseInteger {
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
