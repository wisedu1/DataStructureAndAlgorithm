package offer.medium.no4;

class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix != null && matrix.length != 0) {
            int i = 0, j = matrix[0].length - 1;
            while (i < matrix.length && j >= 0) {
                if (target == matrix[i][j]) {
                    return true;
                } else if (target > matrix[i][j]) {
                    i++;
                } else if (target < matrix[i][j]) {
                    j--;
                }
            }
        }
        return false;
    }
}
