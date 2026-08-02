package hashtable;

import java.util.ArrayList;
import java.util.Arrays;

public class Intersection {
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
    public static void main(String[] args) {
        Intersection intersection = new Intersection();
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(intersection.intersect(nums1, nums2)));

    }
}
