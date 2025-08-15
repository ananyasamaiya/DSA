class Solution {
    public boolean isPowerOfFour(int n) {
        if(n < 1) return false;

        if((n & n-1) == 0 && Integer.bitCount(n-1) % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}