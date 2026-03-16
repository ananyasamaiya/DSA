class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] arr = new int[2];
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[correct] != nums[i]){
                swap(nums, correct, i);
            }else{
                i++;
            }
        }
        for(int j=0; j<nums.length; j++){
            if(nums[j] != j + 1){
                arr[0] = nums[j];
                arr[1] = j+1;
            }
        }


        return arr;
    }
    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}