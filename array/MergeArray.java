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

    public static void main(String[] args) {
        int[] nums1 = {10,20,20,40,0,0};
        int m = 4;
        int[] nums2 = {1,2};
        int n = 2;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}
