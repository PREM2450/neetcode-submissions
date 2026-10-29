class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        int[] freq = new int[128];

        // store frequency of t
        for (char c : t.toCharArray()) {
            freq[c]++;
        }

        int left = 0;
        int count = t.length();
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {

            // if char is useful
            if (freq[s.charAt(right)] > 0) {
                count--;
            }

            freq[s.charAt(right)]--;

            // when all chars matched
            while (count == 0) {

                // update answer
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                // shrink window
                freq[s.charAt(left)]++;

                if (freq[s.charAt(left)] > 0) {
                    count++;
                }

                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" 
               : s.substring(start, start + minLen);
    }
}