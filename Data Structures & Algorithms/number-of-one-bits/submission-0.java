class Solution {
    public int hammingWeight(int n) {
        int cnt=0;
        int mask =1;
        for(int i=0;i<32;i++){
            if ((mask & (n>>i))==1)
            cnt+=1;
        }
        return cnt;
        
    }
}
