class Solution {
    public List<Integer> lastVisitedIntegers(int[] nums) {
        LinkedList<Integer> seen = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int k = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > 0){
                seen.addFirst(nums[i]);
                k = 0;
            }
            else{
                k++;
                if(k <= seen.size()){
                    ans.add(seen.get(k-1));
                }
                else{
                    ans.add(-1);
                }
            }
        }
        return ans;
    }
}