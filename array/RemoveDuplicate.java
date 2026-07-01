package array;

public class RemoveDuplicate {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        for(int i = 0; i<n;i++){
            for(int j = i+1; j<n; j++){
                if(nums[i] == nums[j]){
                    // Shift elements left
                    for (int k = j; k < n - 1; k++) {
                        nums[k] = nums[k + 1];
                    }
                    n--;
                    j--;
                }
            }
        }
        return n;
    }
    // Two-Pointer Approach.......
    public int removeDuplicates2(int[] nums) {
        int left = 1;
        for (int right = 1; right < nums.length; right++) {
            if (nums[right] != nums[right - 1]) {
                nums[left++] = nums[right];
            }
        }
        return left;
    }
    public static void main(String[] args) {
        int[] nums={1,1,2,3,4};
        RemoveDuplicate  rDuplicate = new RemoveDuplicate();
        System.out.println(rDuplicate.removeDuplicates(nums));
        System.out.println(rDuplicate.removeDuplicates2(nums));

    }
}
