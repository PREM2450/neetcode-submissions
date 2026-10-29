class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int Max_water=0;
        while(left<right){
            int h=Math.min(heights[left],heights[right]);
            int breadth=right-left;
            int area=h*breadth;
            Max_water=Math.max(Max_water,area);
            if (heights[left]<heights[right]){
                left++;
            }else{
                right--;
            }
        }
        return Max_water;

        
        
    }
}
