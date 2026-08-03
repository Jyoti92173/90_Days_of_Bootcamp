// Problem Statement : Write an algorithm to determine if a number n is happy.
// A happy number is a number defined by the following process:
// Starting with any positive integer, replace the number by the sum of the squares of its digits.
//Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
//Those numbers for which this process ends in 1 are happy.
//Return true if n is a happy number, and false if not.


package hashtable;

public class HappyNumber {
    // Brute Force Approach.........
    public boolean isHappy(int n) {
        int sum = n;
        int x = n;
        if(n == 1 || n == 7)
            return true;
        while(sum > 9) {
            sum = 0;
            while (x > 0) {
                int d = x%10;
                sum =sum+ d*d;
                x=x/10;
            }
            if (sum == 1||sum == 7 )
                return true;
            x = sum;
        }

        return false;
    }
    public static void main(String[] args) {
        int n = 19;
        HappyNumber h = new HappyNumber();
        System.out.println(h.isHappy(n));

    }
}
