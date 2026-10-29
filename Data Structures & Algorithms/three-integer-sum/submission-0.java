class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>>lst=new HashSet<>();
        for (int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if ((nums[i]+nums[j]+nums[k])==0){
                        List<Integer>trip=new ArrayList<>();
                        trip.add(nums[i]);
                        trip.add(nums[j]);
                        trip.add(nums[k]);
                        Collections.sort(trip);
                        lst.add(trip);
                        
                    }
                }
            }
        }
    
    return new ArrayList<>(lst);
        
        
    }
    
}
