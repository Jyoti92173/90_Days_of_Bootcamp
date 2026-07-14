// Problem Statement : You are given an array nums consisting of n elements where each element is an integer representing a color:

//0 represents red
//1 represents whit
//2 represents blue

//Your task is to sort the array in-place such that elements of the same color are grouped together and arranged in the order: red (0), white (1), and then blue (2).
//You must not use any built-in sorting functions to solve this problem.

package array;

import java.util.Arrays;

public class SortColors {
    // Brute-Force approach........

    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        // Count the occurrences of 0, 1, and 2
        for (int num : nums) {
            if (num == 0) {
                count0++;
            } else if (num == 1) {
                count1++;
            } else {
                count2++;
            }
        }

        int index = 0;

        // Fill all 0's
        while (count0 > 0) {
            nums[index] = 0;
            index++;
            count0--;
        }

        // Fill all 1's
        while (count1 > 0) {
            nums[index] = 1;
            index++;
            count1--;
        }

        // Fill all 2's
        while (count2 > 0) {
            nums[index] = 2;
            index++;
            count2--;

        }
    }

    // Counting Sort Approach..........
    public void sortColors2(int[] nums) {
        int[] count = new int[3];
        for (int num : nums) {
            count[num]++;
        }

        int index = 0;
        for (int i = 0; i < 3; i++) {
            while (count[i]-- > 0) {
                nums[index++] = i;
            }
        }
    }

    public void sortColor(int[] nums){
        
    }
    public static void main(String[] args) {
        int[] nums= {1,0,1,2};
        SortColors sc = new SortColors();
        sc.sortColors(nums);
        System.out.println(Arrays.toString(nums));

        sc.sortColors2(nums);
        System.out.println(Arrays.toString(nums));
    }
}
