
class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int maxLen = 0;
        for (int num : nums) {
            
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentLen = 1;

                
                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentLen++;
                }

                
                maxLen = Math.max(maxLen, currentLen);
            }
        }

        return maxLen;
    }
}
