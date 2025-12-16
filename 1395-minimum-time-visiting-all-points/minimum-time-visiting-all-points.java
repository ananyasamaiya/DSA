class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int result = 0;
        for(int i=1; i<points.length; i++){
            int temp = Integer.max(Math.abs(points[i][1]-points[i-1][1]) , Math.abs(points[i][0]-points[i-1][0]));
            result += temp;
        }
        return result;
    }
}