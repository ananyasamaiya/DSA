class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;

        for(int row=0; row<accounts.length; row++){
            int wealth = 0;
            for(int col=0; col<accounts[row].length; col++){
                wealth += accounts[row][col];
            }
            max = Math.max(max,wealth);
        }
        return max;
    }
}