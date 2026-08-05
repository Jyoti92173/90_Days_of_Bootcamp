package hashtable;

import java.util.Arrays;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums){
     int n = nums.length;
     Arrays.sort(nums);
     for(int i = 1; i<n; i++){
         if(nums[i] == nums[i-1]){
             return true;
         }
     }
    return false;
    }
    
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        ContainsDuplicate dc = new ContainsDuplicate();
        System.out.println("Brute Force Approach : " + dc.containsDuplicate(nums));

    }
}
