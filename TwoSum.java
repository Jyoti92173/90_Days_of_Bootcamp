import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    // Brute force approach...............
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int []{};
    }

    // Using HashMap.............
    public int[] twoSum2(int[] nums, int target) {
        int len = nums.length;
        int[] ans = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < len; i++){
            int result = target-nums[i];
            if(map.containsKey(result)){
                ans[0] = map.get(result);
                ans[1] = i;
                return ans;
            }
            map.put(nums[i],i);
        }
        return ans;

    }

     static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 17;
        TwoSum ts = new TwoSum();
        System.out.println(Arrays.toString(ts.twoSum(nums, target)));
         System.out.println(Arrays.toString(ts.twoSum2(nums, target)));

    }

}


