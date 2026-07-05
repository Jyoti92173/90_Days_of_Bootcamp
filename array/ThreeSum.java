// Problem Statement : Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] where nums[i] + nums[j] + nums[k] == 0, and the indices i, j and k are all distinct.

//The output should not contain any duplicate triplets. You may return the output and the triplets in any order.

package array;

import java.util.*;

public class ThreeSum {
    // Brute-Force Approach............f
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> tmp = Arrays.asList(nums[i], nums[j], nums[k]);
                        res.add(tmp);
                    }
                }
            }
        }
        return new ArrayList<>(res);
    }
    // Two-Pointer Approach................
    public List<List<Integer>> threeSum1(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length < 3) return res;

        Arrays.sort(nums);// Sort array

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // skip duplicates
            if (nums[i] > 0) break;

            int left = i + 1, right = nums.length - 1;
            int target = -nums[i];

            while (left < right) {
                int sum = nums[left] + nums[right];
                if (sum == target) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return res;
    }
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> ans = threeSum(nums);

        System.out.println(ans);


    }
}
