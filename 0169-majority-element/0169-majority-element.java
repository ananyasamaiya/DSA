class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        } 
        int majority = nums.length / 2;
        System.out.println("majority" + majority);
        for(int num : nums){
            System.out.println(num + " : " + map.get(num));
            if(map.get(num) > majority){
                return num;
            }
        }
        return 0;
    }
}