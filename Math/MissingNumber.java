package Math;

public class MissingNumber {
    // Brute-Force Approach.........
    public int missingNumber(int[] nums){
        int len = nums.length;
       for(int i=0;i<=len;i++){
           boolean found = false;
           for(int j=0;j<len;j++){
               if(nums[j] == i){
                   found = true;
                   break;
               }
           }
           if(!found){
               return i;
           }
       }
       return -1;
    }
    public int  missingNumber2(int[] nums){
        int len = nums.length;
        int totalSum = len*(len+1)/2;
        int sum = 0;
        for(int num:nums){
            sum = sum + num;
        }
        totalSum = totalSum - sum;
        return totalSum;
    }

    public static void main(String[] args){
        int[] nums= {0,1,2,3,5};
        MissingNumber m = new MissingNumber();
        System.out.println("Brute-Force:"+ m.missingNumber(nums));
        System.out.println(m.missingNumber2(nums));
    }
}
