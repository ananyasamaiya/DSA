;
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] result = new int[k][2];
        Arrays.sort(points, new pointSort());

        for(int i=0; i<k; i++){
            result[i] = points[i];
        }

        return result;
    }
    
}
class pointSort implements Comparator<int[]>{
    public int compare(int[] a, int[] b){
        Integer distA = a[0] * a[0] + a[1] * a[1]; 
        Integer distB = b[0] * b[0] + b[1] * b[1]; 
        return distA.compareTo(distB);
    }
}
