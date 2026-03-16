class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();

        int i=0;
        while(i <nums.length){
            int correct = nums[i] - 1;
            if(nums[correct] != nums[i]){
                swap(nums,correct,i);
            }
            else{
                i++;
            }
        }
        for(int j=0; j<nums.length; j++){
            if(nums[j] != j + 1){
                list.add(nums[j]);
            }
        }
        return list;
    }
    public static void swap(int[] nums, int first, int second){
        int temp = nums[second];
        nums[second] = nums[first];
        nums[first] = temp;
    }
}