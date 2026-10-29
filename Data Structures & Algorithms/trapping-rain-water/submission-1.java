class Solution {
    public int trap(int[] heights) {
        
        int n=heights.length;
        int[] leftmost=new int[n];
        leftmost[0]=heights[0];
        for(int i=1;i<n;i++){
            leftmost[i]=Math.max(heights[i],leftmost[i-1]);

        }
        int[] rightmost=new int[n];
        rightmost[n-1]=heights[n-1];
        for(int j=n-2;j>=0;j--){
            rightmost[j]=Math.max(heights[j],rightmost[j+1]);
        }
        int trapwater=0;
        for(int k=0;k<n;k++){
            int waterlevel=Math.min(leftmost[k],rightmost[k]);
            trapwater=trapwater+(waterlevel-heights[k]);
        }
        return trapwater;
    }

}
