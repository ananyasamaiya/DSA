class Solution {
    public double myPow(double x, int n) {
        if (n==0) return 1.0;
        long power = (long)n;
        double result = 1.0;
        double number = x;
        if(n<0) power = -(long)n;
        while(power > 0){
            if(power % 2 == 1){
                power--;
                result = result * number;
            }
            else{
                power/=2;
                number = number * number;
            }
        }
        if(n > 0) return result;
        else return (1.0/result);
    }
}