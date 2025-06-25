class Rotate_Matrix_By_90_Degrees_Clockwise{
    public static int[][] rotateMatrix(int[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;

        for(int i=0; i<row; i++){
            for(int j=i; j<col; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0; i<row; i++){
            for(int k=0,j=col-1; k<col/2; k++,j--){
                int temp = matrix[i][k];
                matrix[i][k] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
        return matrix;
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
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Original Matrix : ");
        printMatrix(matrix);
        rotateMatrix(matrix);
        System.out.println("Rotate Matrix By 90 Degrees Clockwise: ");
        printMatrix(matrix);
    }
}