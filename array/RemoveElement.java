// Problem Statement : Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
// Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
// Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
//Return k.


package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveElement {
    // Brute Force Approach
    public static int removeElement(int[] nums, int val) {
        int n =  nums.length;
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (num != val) {
                list.add(num);
            }
        }
        for(int i =0;i<list.size();i++){
            nums[i] = list.get(i);
        }
        return list.size();
    }
    // Two-Pointer approach................
    public static int removeElement2(int[] nums, int val) {
        int i = 0, n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[--n];
            } else {
                i++;
            }
        }
        return n;
    }


    public static void main(String[] args) {
        int[] nums = {30,2,2,30,8};
        int val =30 ;
        System.out.println(removeElement(nums,val));
        System.out.println(removeElement2(nums,val));
    }
}
