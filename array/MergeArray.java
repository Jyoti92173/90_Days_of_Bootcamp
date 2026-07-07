// Problem Statement :  You are given two integer arrays nums1 and nums2, both sorted in non-decreasing order, along with two integers m and n, where:
//m is the number of valid elements in nums1,
//n is the number of elements in nums2.
//The array nums1 has a total length of (m+n), with the first m elements containing the values to be merged, and the last n elements set to 0 as placeholders.
//Your task is to merge the two arrays such that the final merged array is also sorted in non-decreasing order and stored entirely within nums1.

package array;

import java.util.Arrays;

public class MergeArray {
    // Sorting Approach.................
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i=0; i<n; i++){
            nums1[i+m] =  nums2[i];
        }
        Arrays.sort(nums1);
    }
    // Two-Pointer Approach.........
    public static void merge1(int[] nums1, int m, int[] nums2, int n){
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {

            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }

            k--;
        }

        // Copy remaining elements from nums2
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {10,20,20,40,0,0};
        int m = 4;
        int[] nums2 = {1,2};
        int n = 2;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums1));
    }
}
