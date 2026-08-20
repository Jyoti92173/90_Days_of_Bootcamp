package array;

public class SingleNumber {
    // Bit Manipulation Approach................
    public int singleNumber(int[] nums) {
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
    System.out.println(singleNumber.singleNumber(nums));
    
    }
}
