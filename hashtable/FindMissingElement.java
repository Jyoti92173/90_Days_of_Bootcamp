// Problem Statement : You are given an integer array nums consisting of unique integers.
// Originally, nums contained every integer within a certain range. However, some integers might have gone missing from the array.
// The smallest and largest integers of the original range are still present in nums.
// Return a sorted list of all the missing integers in this range. If no integers are missing, return an empty list.


package hashtable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMissingElement {
    // Sorting Approach..........
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> res = new ArrayList<>();

        Arrays.sort(nums);

        int currEle = nums[0];

        for(int i = 0 ; i < nums.length ; currEle++, i++){
            if(currEle < nums[i]){
                res.add(currEle);
                i--;
            }
        }

        return res;
    }

    // Boolean Array Approach.........

    public List<Integer> findMissingElements2(int[] nums) {
        List<Integer> res = new ArrayList<>();
        boolean[] contains = new boolean[101];

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int ele : nums){
            min = Math.min(min, ele);
            max = Math.max(max, ele);
            contains[ele] = true;
        }

        for(int i = min; i <= max; i++){
            if(!contains[i]){
                res.add(i);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums= {1,4,2,5};
        int[] nums2 = {5,1};
        FindMissingElement obj = new FindMissingElement();
        List<Integer> res1 = obj.findMissingElements(nums);
        List<Integer> res2 = obj.findMissingElements(nums2);
        System.out.println("Sorting Approach : " + res1);
    }
}
