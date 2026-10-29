class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer>list=new ArrayList<>();
        int i=0;
        int j=0;
        while(i!=nums1.length && j!=nums2.length){
            if(nums1[i]<nums2[j]){
                list.add(nums1[i]);
                i++;
            }else{
                list.add(nums2[j]);
                j++;
            }
        } 
        if(i!=nums1.length){
            for(int x=i;x<nums1.length;x++){
                list.add(nums1[x]);
            }
        }else{
            for(int y=j;y<nums2.length;y++){
                list.add(nums2[y]);
            }
        } 
        int n=list.size();
        if(n%2==0){
            return (list.get(n/2)+list.get((n/2)-1))/2.0;
        }else{

            return (list.get(n/2)).doubleValue();
        }     
    }
}
