class Matrix_Multiplication{
    public static void matrix_multiplication(int[][] A, int[][] B){
        int rowA = A.length;
        int colA = A[0].length;
        int rowB = B.length;
        int colB = B[0].length;
        if (colA != rowB) {
            System.out.println("Matrix multiplication not possible. Columns of A must equal rows of B.");
            return;
        }
        int[][] result = new int[rowA][colB];
        for(int i=0; i<rowA; i++){
            for(int j=0; j<colB; j++){
                result[i][j] = 0;
                for(int k=0; k<colA; k++){
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        printMatrix(result);
    } public static void printMatrix(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int[][] A = {{1,2,3}, {4,5,6}};
        int[][] B = {{7,8}, {9,10}, {11,12}};
        matrix_multiplication(A, B);
        
    }
}