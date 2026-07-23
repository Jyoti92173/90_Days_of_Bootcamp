package Math;

public class MissingNumber {
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
    public static void main(String[] args){
        int[] nums= {0,1,2,3,5};
        MissingNumber m = new MissingNumber();
        System.out.println(m.missingNumber(nums));
    }
}
