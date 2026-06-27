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
