package array;

public class CanPlaceFlower {
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
