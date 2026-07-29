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
    public static void main(String[] args) {
        PlusOne p = new PlusOne();
        System.out.println(Arrays.toString(p.plusOne(new int[]{1, 2, 3})));
    }
}
