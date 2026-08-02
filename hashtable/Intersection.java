// Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.
//Example 1:

//Input: nums1 = [1,2,2,1], nums2 = [2,2]
//Output: [2]


package hashtable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Intersection {
    // Brute Force Approach........
    public int[] intersect(int[] nums1, int[] nums2) {

            ArrayList<Integer> list = new ArrayList<>();

            // Compare every element of nums1 with every element of nums2
            for (int i = 0; i < nums1.length; i++) {

                for (int j = 0; j < nums2.length; j++) {

                    if (nums1[i] == nums2[j]) {

                        // Check if already present in result
                        boolean found = false;

                        for (int k = 0; k < list.size(); k++) {
                            if (list.get(k) == nums1[i]) {
                                found = true;
                                break;
                            }
                        }

                        if (!found) {
                            list.add(nums1[i]);
                        }

                        break;
                    }
                }
            }

            int[] result = new int[list.size()];

            for (int i = 0; i < list.size(); i++) {
                result[i] = list.get(i);
            }

            return result;
    }
    // Using HashSet Approach..........

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();

        for(int i : nums1)
        {
            s1.add(i);
        }
        for(int i : nums2){
            if(s1.contains(i)) s2.add(i);
        }

        int[] res = new int[s2.size()];
        int i = 0;
        for(int n : s2)
        {
            res[i++] = n;
        }
        return res;
    }
    public static void main(String[] args) {
        Intersection intersection = new Intersection();
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(intersection.intersect(nums1, nums2)));

    }
}
