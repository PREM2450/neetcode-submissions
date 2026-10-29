class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[] leftpri=new int[n];
        leftpri[0]=prices[0];
        for(int i=1;i<n;i++){
            leftpri[i]=Math.min(prices[i],leftpri[i-1]);
        }
        int[] rightpri=new int[n];
        rightpri[n-1]=prices[n-1];
        for(int i=n-2;i>=0;i--){
            rightpri[i]=Math.max(prices[i],rightpri[i+1]);
        }
        int maxprofit=0;
        for(int i=0;i<n;i++){
            int prof=rightpri[i]-leftpri[i];
            maxprofit=Math.max(maxprofit,prof);
        }
        if (maxprofit<0){
            return 0;

        }else{
            return maxprofit;
        }
    }
    }