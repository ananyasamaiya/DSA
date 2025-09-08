class Solution {
    public int[] getNoZeroIntegers(int n) {

        for(int i=1;i<n;i++){
            int first = i;
            int second = n-i;
            if(!String.valueOf(first).contains("0") && !String.valueOf(second).contains("0")){
                return new int[]{first,second};
            }
        }
        return new int[0];
    }
   
}