package array;

public class BinarySearch {
    // Brute-Force Using Linear Search Approach
    
    public int binarySearch(int[] arr,int target){

        int i = 0;
        while(i<arr.length){
            if(arr[i]==target){
                return i;
            }
            i++;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {-1,0,2,4,6,8};
        int target= 8;
        BinarySearch bs = new BinarySearch();
        System.out.println(bs.binarySearch(nums, target));
    }
}
