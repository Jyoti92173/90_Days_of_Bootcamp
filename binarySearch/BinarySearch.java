// Problem Statement : You are given an array of distinct integers nums, sorted in ascending order, and an integer target.
//Implement a function to search for target within nums. If it exists, then return its index, otherwise, return -1
//Your solution must run in O(logn) time.

package binarySearch;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int i = 0;
        while(i<nums.length){
            if(nums[i] == target){
                return i;
            }
            i++;
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int target = 9;
        System.out.println(bs.search(nums,target));

    }
}
