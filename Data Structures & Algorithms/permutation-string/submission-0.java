class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length()>s2.length()){
            return false;
        }
        int[] cnt1=new int[26];
        int[] cnt2=new int[26];
        for(char c:s1.toCharArray()){
            cnt1[c-'a']++;
        }
        int windowsize=s1.length();
        for(int i=0;i<s2.length();i++){
            cnt2[s2.charAt(i)-'a']++;
            if(i>=windowsize){
                cnt2[s2.charAt(i-windowsize)-'a']--;


            }
            if(Arrays.equals(cnt1,cnt2)){
                return true;
            }
        }

        return false;
    }
}
