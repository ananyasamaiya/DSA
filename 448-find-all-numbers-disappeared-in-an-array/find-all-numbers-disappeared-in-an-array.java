class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        List<Integer> list = new ArrayList<>();
        while(i<nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums,correct,i);
            }else{
                i++;
            }
        }
        for(int j = 0; j < nums.length; j++){
            if(j != nums[j] - 1){
                list.add(j+1);
            }
        }

        return list;
    }
    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}