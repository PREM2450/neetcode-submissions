class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> prem = new ArrayList<>();
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }
        for (int i = 0; i < k; i++) {
            int maxFreq = 0;
            int maxKey = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() > maxFreq) {
                    maxFreq = entry.getValue();
                    maxKey = entry.getKey();
                }
            }
            prem.add(maxKey);
            map.remove(maxKey); 
        }
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = prem.get(i);
        }

        return ans;
    }
}
