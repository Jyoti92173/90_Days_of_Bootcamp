package binarySearch;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int i=0;
        while(i<nums.length){
            if(nums[i]==target){
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
