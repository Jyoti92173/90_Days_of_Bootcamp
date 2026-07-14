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
    // Three Pointer Approach.......

    public void sortColors3(int[] nums) {
        int i = 0, l = 0, r = nums.length - 1;
        while (i <= r) {
            if (nums[i] == 0) {
                swap(nums, l, i);
                l++;
            } else if (nums[i] == 2) {
                swap(nums, i, r);
                r--;
                i--;
            }
            i++;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Three Pointer Approach - II

    public void sortColors4(int[] nums) {
        int zero = 0, one = 0, two = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[two++] = 2;
                nums[one++] = 1;
                nums[zero++] = 0;
            } else if (nums[i] == 1) {
                nums[two++] = 2;
                nums[one++] = 1;
            } else {
                nums[two++] = 2;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums= {1,0,1,2};
        SortColors sc = new SortColors();
        sc.sortColors(nums);
        System.out.println(Arrays.toString(nums));

        sc.sortColors2(nums);
        System.out.println(Arrays.toString(nums));
        sc.sortColors3(nums);
        System.out.println(Arrays.toString(nums));

        sc.sortColors4(nums);
        System.out.println(Arrays.toString(nums));
    }
}
