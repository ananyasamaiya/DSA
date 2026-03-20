class Solution {
    public int[][] transpose(int[][] matrix) {
        int rowLength = matrix.length;
        int colLength = matrix[0].length;
        int[][] result = new int[colLength][rowLength];

        for(int row=0; row<rowLength; row++){
            for(int col=0; col<colLength; col++){
                result[col][row] = matrix[row][col];
            }
        }
        return result;
    }
}