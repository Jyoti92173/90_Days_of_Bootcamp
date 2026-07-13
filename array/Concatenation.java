// Problem Statement: You are given an integer array nums of length n. Create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
//
//Specifically, ans is the concatenation of two nums arrays.


package array;

import java.util.Arrays;

public class Concatenation {
    // Brute-Force Approach.................
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] result = new int[2*n];
        for (int i = 0; i < n; i++) {
            result[i] = nums[i];
        }
        for(int i = 0; i<n ; i++){
            result[i+n]= nums[i];
        }
        return result;
    }
    // One-Pass Approach..........
    public static int[] getConcatenation2(int[] nums) {
        int n = nums.length;
        int[] result = new int[2*n];
        for(int i = 0; i < n; i++){
            result[i] = nums[i];
            result[i+n]= nums[i];
        }
    return  result;
    }


    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(getConcatenation(nums)));
        System.out.println(Arrays.toString(getConcatenation2(nums)));
    }
}
