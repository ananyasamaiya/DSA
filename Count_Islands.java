class Count_Islands{
    public static int countIslands(char[][] grid){
        int row = grid.length;
        int col = grid[0].length;
        int count = 0;
        boolean[][] visited = new boolean[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(grid[i][j] == '1' && !visited[i][j]){
                    dfs(grid, visited, i, j);
                    count++;
                }
            }
        }
        return count;
    }
    public static void dfs(char[][] grid, boolean[][] visited, int row, int col){
        if(row <0 || row>=grid.length || col<0 || col>=grid[0].length)
            return;
        if(grid[row][col] == '0' || visited[row][col])
            return;
        
        visited[row][col] = true;

        dfs(grid,visited,row-1,col);
        dfs(grid,visited,row+1,col);
        dfs(grid,visited,row,col-1);
        dfs(grid,visited,row,col+1);
    }
    public static void main(String[] args) {
        char[][] grid = {
            {'1', '1', '0', '0', '0'},
            {'0', '1', '0', '0', '0'},
            {'0', '0', '0', '0', '1'},
            {'0', '0', '0', '1', '1'}
        };

        System.out.println("Number of Islands: " + countIslands(grid));
    }
}