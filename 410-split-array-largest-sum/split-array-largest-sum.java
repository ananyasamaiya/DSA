class Solution {
    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        for(int num : nums){
            start = Math.max(start,num);
            end += num; 
        }
        System.out.println("start: " + start);
        System.out.println("end: " + end);
        while(start < end){
            int mid = start + (end - start)/2;
            System.out.println("start: " + start);
            System.out.println("end: " + end);
            System.out.println("mid: " + mid);
            int sum = 0;
            int pieces = 1;

            for(int num : nums){
                if(sum + num > mid){
                    sum = num;
                    pieces++;
                }
                else{
                    sum += num;
                }
            }
            System.out.println("pieces: " + pieces);
            if(pieces <= k){
                end = mid;
            }
            else{
                start = mid + 1;
            }

        }
        return end;
    }
}