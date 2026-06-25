package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    // Sorting-based-approach.............
    public static boolean hasDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) return false;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }

// Using HashSet approach............
    public static boolean hasDuplicateUsingSet(int[] nums) {
        if (nums == null || nums.length == 0) return false;
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
    int[] nums = {1, 2, 3, 1};
        System.out.println(hasDuplicate(nums));
        System.out.println(hasDuplicateUsingSet(nums));
    }
}

