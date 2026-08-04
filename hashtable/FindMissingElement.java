package hashtable;

import array.FirstAndLastPosition;

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
    public static void main(String[] args) {
        int[] nums= {1,4,2,5};
        FindMissingElement obj = new FindMissingElement();
        List<Integer> res = obj.findMissingElements(nums);
        System.out.println(res);
    }
}
