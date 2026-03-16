class Solution {
    public int missingNumber(int[] nums) {
        int i=0;

        while(i < nums.length){
            int correct = nums[i];
            if(nums.length != correct && nums[i] != nums[correct]){
                swap(nums,correct,i);
            }
            else{
                i++;
            }
        }

        for(int j=0; j<nums.length;j++){
            if(nums[j] != j){
                return j;
            }
        }
        return nums.length;
    }
    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}