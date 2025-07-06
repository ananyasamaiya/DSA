class Find_Median{
    public static int findMedian(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<rows; i++){
            if(matrix[i][0] < min)
                min = matrix[i][0];
            if(matrix[i][cols-1] > max)
                max = matrix[i][cols - 1];
        }
        int desiredPosition = (rows * cols + 1)/2;
        while (min < max){
            int mid = min + (max-min)/2;
            int count = 0;

            for(int i=0; i<rows; i++){
                count += countSmallerOrEqual(matrix[i], mid);
            }
            if (count < desiredPosition) {
                min = mid + 1;
            } else {
                max = mid;
            }
        }
        return min;
    }
    public static int countSmallerOrEqual(int[] row, int target){
        int low = 0;
        int high = row.length - 1;
        while(low <= high){
            int mid = low + (high-low)/2;

            if(row[mid] <= target){
                low = mid + 1;
            }
            else
                high = mid - 1;
        }
        return low;
    }
    public static void main(String[] args){
        int[][] matrix = {
            {1, 3, 5},
            {2, 6, 9},
            {3, 6, 9}
        };
        System.out.println("Median : " + findMedian(matrix));
    }
}