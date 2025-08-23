class Solution {
    public int maxOperations(int[] nums, int k) {
        int count = 0;
        Arrays.sort(nums);
        int left = 0 , right = nums.length - 1;
        while(left < right){
            if(nums[left] + nums[right] == k){
                left++;
                right--;
                count++;
            }
            else if(nums[left] + nums[right] < k){
                left++;
            }
            else{
                right--;
            }
        }
        return count;
    }
}