class Solution {
    public int maxFrequencyElements(int[] nums) {
       HashMap<Integer,Integer> map = new HashMap<>();
       int max_freq = Integer.MIN_VALUE;
       int total_freq = 0;

       for(int num : nums){
        if(map.containsKey(num)){
            int count = map.get(num);
            count++;
            map.put(num,count);
        }
        else{
            map.put(num,1);
        }
        max_freq = Math.max(max_freq,map.get(num));
       }
       
       for(int num : nums){
        if(map.get(num) == max_freq) total_freq++;
       }
       return total_freq; 
    }
}