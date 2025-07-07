class Maximum_Size_Rectangle{
    public static int maximumAreaRectangle(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int Maxarea = 0;
        if(rows == 0) return 0;
        int[] heights = new int[cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(matrix[i][j] == 1){
                    heights[j] += 1;
                }else{
                    heights[j] = 0;
                }
            }

        for(int start=0; start<cols; start++){
            int Height = heights[start];
            for(int end=start; end<cols; end++){
                Height = Math.min(Height, heights[end]);
                int Width = end - start + 1;
                int area = Width * Height;
                Maxarea = Math.max(Maxarea, area);
            }
        }
        }
        return Maxarea;
    }
    public static void main(String[] args){
        int[][] matrix = {
            {1, 0, 1, 1},
            {1, 1, 1, 1},
            {1, 1, 0, 1}
        };
        System.out.println("Maximum Rectangle Area: " + maximumAreaRectangle(matrix));
    }
}