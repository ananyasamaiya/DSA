class Boolean_Matrix_Problem{
    public static void booleanMatrix(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean[] rowMatrix = new boolean[rows];
        boolean[] colMatrix = new boolean[cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(matrix[i][j] == 1){
                    rowMatrix[i] = true;
                    colMatrix[j] = true;
                }
            }
        }
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(rowMatrix[i] || colMatrix[j]){
                   matrix[i][j] = 1;
                }
            }
        }
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
        
        int[][] matrix = {
        {1, 0, 0},
        {0, 0, 0},
        {0, 0, 1}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        booleanMatrix(matrix);

        System.out.println("Modified Matrix:");
        printMatrix(matrix);
    }
}