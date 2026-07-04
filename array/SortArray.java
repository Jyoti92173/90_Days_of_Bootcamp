package array;

import java.util.Arrays;

public class SortArray {
    // Brute-Force Approach......
    public static int[] sortArray(int[] nums) {
        int len = nums.length;
        for(int i=0; i<len; i++){
            for(int j=i+1; j<len; j++){
                if(nums[i]>nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;

    }

    public static void main(String[] args) {
        int[] nums = {10,9,1,1,1,2,3,1};

        System.out.println(Arrays.toString(sortArray(nums)));
    }
}
