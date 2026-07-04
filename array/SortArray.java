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
    // Two-Pointer Approach........
    public static int[] sortArray2(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }
    private static void mergeSort(int[] nums, int left, int right) {

        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        // Sort left half
        mergeSort(nums, left, mid);

        // Sort right half
        mergeSort(nums, mid + 1, right);

        // Merge both halves
        merge(nums, left, mid, right);
    }
    private static void merge(int[] nums, int left, int mid, int right) {

        int[] temp = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {

            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        // Copy remaining elements from left half
        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        // Copy remaining elements from right half
        while (j <= right) {
            temp[k++] = nums[j++];
        }

        // Copy back to original array
        for (int p = 0; p < temp.length; p++) {
            nums[left + p] = temp[p];
        }
    }

    public static void main(String[] args) {
        int[] nums = {10,9,1,1,1,2,3,1};
        System.out.println(Arrays.toString(sortArray(nums)));

        System.out.println(Arrays.toString(sortArray2(nums)));
    }
}
