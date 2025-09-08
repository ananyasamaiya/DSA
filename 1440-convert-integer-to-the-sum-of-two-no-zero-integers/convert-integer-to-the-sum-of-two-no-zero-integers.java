class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] ans = new int[2];
        for(int i=1;i<n;i++){
            int first = i;
            int second = n-i;
            if(checkNoZeroIntegers(first) && checkNoZeroIntegers(second)) 
            {
                ans[0] = first;
                ans[1] = second;
            }
        }
        return ans;
    }
    private boolean checkNoZeroIntegers(int num){
        
        while(num > 0){
            int digit = num % 10;
            if(digit == 0) return false;
            num = num/10;
        }
        return true;
    }
}