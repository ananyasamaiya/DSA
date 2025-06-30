class Print_Diagonals_Of_A_Matrix{
    public static void printDiagonals(int[][] matrix){
        System.out.print("Primary Diagonal: ");
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(i==j){
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
        System.out.println();
        System.out.print("Secondary Diagonal: ");
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(i+j == matrix.length-1){
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }
    public static void main(String[] args){
        int[][] matrix = {{10, 11, 12, 13},{14, 15, 16, 17},{18, 19, 20, 21},{22, 23, 24, 25}};
        printDiagonals(matrix);
    }
}