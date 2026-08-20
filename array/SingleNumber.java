// You are given a non-empty array of integers nums. Every integer appears twice except for one.
//
//Return the integer that appears only once.
//
//You must implement a solution with
//O
//(
//n
//)
//O(n) runtime complexity and use only
//O
//(1)
//O(1) extra space.

package array;

public class SingleNumber {
    // Brute Force Approach..............
    public int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean flag = true;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return nums[i];
            }
        }
        return -1;
    }
    // Bit Manipulation Approach................
    public int singleNumber1(int[] nums) {
        int result = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            result ^= nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
    int[] nums = {1,2,3,4,5};
    SingleNumber singleNumber = new SingleNumber();
    System.out.println(singleNumber.singleNumber1(nums));

    }
}
