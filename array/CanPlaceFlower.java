// You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
//Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.


package array;

public class CanPlaceFlower {
    // Linear Traversal Approach........
    public boolean canPlaceFlowers(int[] flower, int n) {
        if (n == 0) {
            return true;
        }
        int len = flower.length;
        int i = 0;
        while(i<len && n>0){
            if(flower[i]==1){
                i = i+2;
            } else if (i==len-1 || flower[i+1]==0) {
                n--;
                i = i+2;
            }else{
                i = i+3;
            }
        }
        return n<=0;
    }


    public static void main(String[] args) {
       int[] flower = {1,0,0,0,1};
       int n = 1;
       CanPlaceFlower test = new CanPlaceFlower();
       System.out.println(test.canPlaceFlowers(flower, n));

    }
}
