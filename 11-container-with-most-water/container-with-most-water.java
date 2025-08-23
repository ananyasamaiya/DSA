class Solution {
    public int maxArea(int[] height) {
        int Max_area = Integer.MIN_VALUE;
        int i = 0, j = height.length-1;
        while(i < j){
            int heights = Integer.min(height[i],height[j]);
            int widths = j - i;
            Max_area = Integer.max(Max_area, (heights * widths));
            if(height[i] < height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return Max_area;
    }
}