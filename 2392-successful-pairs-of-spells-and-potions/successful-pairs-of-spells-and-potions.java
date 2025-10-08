class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
         Arrays.sort(potions);
        int[] pairs = new int[spells.length];
        
        for(int i=0; i<spells.length; i++){
            long spell = spells[i];
            int count = binarySearch(potions,spell,success);
            pairs[i] = potions.length - count;
        }
        return pairs;
    }
    public int binarySearch(int[] potions,long spell,long success){
        int start = 0;
        int end = potions.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(spell * potions[mid] >= success){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }
}