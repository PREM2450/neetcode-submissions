class Solution {
    public int[] productExceptSelf(int[] nums) {
        int i=0;
        int[] result=new int[nums.length];
        while (i<nums.length){
            // int min=0;
            // int max=nums.length-1;
            int left=0;
            int left_pro=1;
            while (left<i){
                left_pro=left_pro*nums[left];
                left+=1;
            }
            int right=(nums.length)-1;
            int right_pro=1;
            while(right>i){
                right_pro*=nums[right];
                right-=1;

            }
            result[i]=left_pro*right_pro;
            i+=1;
        }
        return result;
        
    }
}  
