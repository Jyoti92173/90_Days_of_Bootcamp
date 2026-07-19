// Problem Statement : You are given an m x n 2-D integer array matrix and an integer target.
//Each row in matrix is sorted in non-decreasing order.
//The first integer of every row is greater than the last integer of the previous row.
//Return true if target exists within matrix or false otherwise.
//Can you write a solution that runs in O(log(m * n)) time?

package binarySearch;

public class SearchMatrix {
    // Linear Search Approach......

    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0; i< matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
// Brute-Force Approach.......
    public boolean searchMatrix1(int[][] matrix, int target) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if (matrix[r][c] == target) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        SearchMatrix searchMatrix = new SearchMatrix();
        int[][] matrix = {{1,2,4,8},{10,11,12,13},{14,20,30,40}};
        int target = 10;
        System.out.println(searchMatrix.searchMatrix(matrix, target));
        System.out.println(searchMatrix.searchMatrix1(matrix, target));
    }
}
