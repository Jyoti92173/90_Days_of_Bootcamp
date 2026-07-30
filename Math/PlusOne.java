// Problem Statement : You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
// Increment the large integer by one and return the resulting array of digits.


package Math;

import java.math.BigInteger;
import java.util.Arrays;

public class PlusOne {
    // Brute Force Approach.........
    public int[] plusOne(int[] digits) {

        StringBuilder number = new StringBuilder();

        for (int digit : digits) {
            number.append(digit);
        }


        BigInteger num = new BigInteger(number.toString());


        num = num.add(BigInteger.ONE);

        String result = num.toString();

        int[] answer = new int[result.length()];

        for (int i = 0; i < result.length(); i++) {
            answer[i] = result.charAt(i) - '0';
        }

        return answer;
    }

    // Array Approach..........

    public int[] plusOne2(int[] digits) {
        int len = digits.length; // length of array;

        // start the loop from last index;
        for (int i = len-1; i>=0; i--) {

            if (digits[i] == 9) {
                digits[i] = 0;
            }else {
                // if ith value is not 9 we just add 1 to it and return;
                digits[i] += 1;
                return digits;
            }
        }

        int[] arr = new int[len+1];
        arr[0] = 1;
        return arr;
    }
    public static void main(String[] args) {
        PlusOne p = new PlusOne();
        System.out.println(Arrays.toString(p.plusOne(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(p.plusOne2(new int[]{1, 2, 3,4})));
    }
}
