package array;

import java.util.Arrays;

public class ProductOfArrayExceptItself {
    // Brute force approach..............
    public static int[] productExceptSelf(int[] nums) {

        int  n= nums.length;
        int[] output = new int[n];
        for (int i = 0; i < n; i++) {

            int product = 1;

            for (int j = 0; j < n; j++) {

                if (i != j) {
                    product *= nums[j];
                }
            }

            output[i] = product;
        }

        return output;
    }
    // Prefix-Suffix Product ............
    public static int[] productExceptItself2(int[] nums) {
        int len = nums.length;
        int[] output = new int[len];
        int prefix = 1;
        for (int i = 0; i < len; i++) {
            output[i] = prefix;
            prefix *= nums[i];
        }
        int suffix = 1;
        // Right Products
        for (int i = len - 1; i >= 0; i--) {
            output[i] *= suffix;
            suffix *= nums[i];
        }
        return output;
    }

    static void main() {
        int[] nums = {1, 2, 4,5};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
        System.out.println(Arrays.toString(productExceptItself2(nums)));
    }
}
