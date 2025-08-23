class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        double avg = 0;
        for(int i=0; i<k; i++){
            sum += nums[i];
        }
        int maxSum = sum;
        for(int i=k; i<nums.length; i++){
            sum += nums[i];
            sum -= nums[i-k];
            maxSum = Integer.max(sum, maxSum); 
        }
        avg = (double)maxSum / k;
        return avg;
    }
}