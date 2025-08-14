class Solution {
    public boolean isPowerOfThree(int n) {
        boolean flag = false;
        if(n < 1) return false;
        while(n%3 == 0){
            n/=3;
        }
        if(n==1) return true;
        else return false;
    }
}