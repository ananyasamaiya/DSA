class Transpose_Of_A_Matrix{
    public static int[][] transposeOfAMatrix(int[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] result = new int[col][row];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
    public static void printMatrix(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int[][] matrix = {{1,2},{3,4},{5,6}};
        System.out.println("Original Matrix : ");
        printMatrix(matrix);
        int[][] result = transposeOfAMatrix(matrix);
        System.out.println("Transpose Matrix : ");
        printMatrix(result);
    }
}