class SetRowsAndColZero{
    public static void setRowsAndColZero(int[][] matrix){

        boolean[] rowFlag = new boolean[matrix.length];
        boolean[] colFlag = new boolean[matrix[0].length];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    rowFlag[i] = true;
                    colFlag[j] = true;
                }
            }
        }
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(rowFlag[i] || colFlag[j]){
                    matrix[i][j] = 0;
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
        int[][] matrix = {{1,0,3},{0,5,6},{7,8,9}};

        System.out.println("Before :");
        printMatrix(matrix);
        setRowsAndColZero(matrix);
        System.out.println("After :");
        printMatrix(matrix);
    }
}