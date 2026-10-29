class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq_store=new int[26];
        int left=0;
        int result=0;
        int max_freq=0;
        for(int right=0;right<s.length();right++){
            freq_store[s.charAt(right)-'A']++;
            max_freq=Math.max(max_freq,freq_store[s.charAt(right)-'A']);
            while((right-left+1)-max_freq>k){
                freq_store[s.charAt(left)-'A']--;
                left++;

            }
        
            result=Math.max(result,right-left+1);
        }
        return result;
        
    }
}
