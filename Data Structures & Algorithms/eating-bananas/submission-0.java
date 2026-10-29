class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int start = 1;
        int end = 0;
        int n = piles.length;

        for(int i = 0; i < n; i++){
            end = Math.max(end, piles[i]);
        }

        int ans = end;

        while(start <= end){

            int total_hour = 0;
            int mid = start + (end - start) / 2;

            for(int i = 0; i < n; i++){
                total_hour += piles[i] / mid;

                if(piles[i] % mid != 0){
                    total_hour++;
                }
            }

            if(total_hour > h){
                start = mid + 1;
            }
            else{
                ans = mid;
                end = mid - 1;
            }
        }

        return ans;
    }
}