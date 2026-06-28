package array;

import java.util.HashMap;

public class MajorityElement {
    public int majorityElements(int[] nums) {
        int n = nums.length;
        for(int i = 0; i<n; i++){
            int count = 0;
            for (int j = 0; j<n ; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count>n/2) {
                return nums[i];
            }
        }
        return -1;
    }
    public int majorityElement2(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int res = 0;
        int count = 0;
        for(int num:nums){
            map.put(num, map.getOrDefault(num,0)+1);
            if(map.get(num)>count){
                res = num;
                count = map.get(num);
            }
        }
        return res;
    }
    // Boyer-Moore Voting Approach........
    public int majorityElement3(int[] nums) {
        int res = 0, count = 0;

        for (int num : nums) {
            if (count == 0) {
                res = num;
            }
            count += (num == res) ? 1 : -1;
        }
        return res;
    }

   public static void main(String[] args) {
        int [] nums = {5,5,1,1,1,5,5};
        MajorityElement m = new MajorityElement();
       System.out.println(m.majorityElements(nums));
       System.out.println(m.majorityElement2(nums));
       System.out.println(m.majorityElement3(nums));


    }
}
