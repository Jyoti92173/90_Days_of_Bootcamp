package binarySearch;

public class SearchMatrix {
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
    public static void main(String[] args) {
        SearchMatrix searchMatrix = new SearchMatrix();
        int[][] matrix = {{1,2,4,8},{10,11,12,13},{14,20,30,40}};
        int target = 10;
        System.out.println(searchMatrix.searchMatrix(matrix, target));
    }
}
