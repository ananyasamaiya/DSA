class Trapping_Rain_Water{
    public static int trappingRainWater(int[] arr){
        int[] leftMaxHeight = new int[arr.length];
        int[] rightMaxHeight = new int[arr.length];
        int count = 0;
        leftMaxHeight[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            leftMaxHeight[i] = Math.max(leftMaxHeight[i - 1], arr[i]);
        }
        rightMaxHeight[arr.length - 1] = arr[arr.length - 1];
        for(int i=arr.length - 2; i>=0; i--){
            rightMaxHeight[i] = Math.max(rightMaxHeight[i + 1], arr[i]);
        }
        for(int i = 1;i<arr.length-1;i++){
            int spaceLeft = (Math.min(leftMaxHeight[i], rightMaxHeight[i]) - arr[i]);
            if(spaceLeft > 0){
                count+=spaceLeft;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int totalWaterTrapped = trappingRainWater(arr);
        System.out.println(totalWaterTrapped);
    }
}