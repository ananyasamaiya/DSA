class Boundary_Traversal_Of_Matrix{
    public static void boundaryTraversal(int[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;
        
        for(int i=0; i<col; i++){
            System.out.print(matrix[0][i] + " ");
        }
        for(int i=1; i<row; i++){
            System.out.print(matrix[i][col-1] + " ");
        }
        if(row > 1){
            for(int i=col-2; i>=0; i--){
                System.out.print(matrix[row-1][i] + " ");
            }
        }
        if(col > 1){
            for(int i=row-2; i>0; i--){
                System.out.print(matrix[i][0] + " ");
            }
        }
    }
    public static void main(String[] args){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        boundaryTraversal(matrix);
    }
}