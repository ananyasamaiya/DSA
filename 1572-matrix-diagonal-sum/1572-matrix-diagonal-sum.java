class Solution {
    public int diagonalSum(int[][] mat) {
        int Length = mat.length;
        int count = 0;
        for(int row=0;row<Length; row++){
            for(int col=0; col<Length; col++){
               if(row == col || (row + col == Length-1)){
                    count += mat[row][col];
               } 
            }
        }
        return count;
    }
}