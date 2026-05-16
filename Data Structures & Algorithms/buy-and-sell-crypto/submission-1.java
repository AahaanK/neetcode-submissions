class Solution {
    public int maxProfit(int[] prices) {
        int max=0;int minClass=prices[0];
        for(int i=0;i<prices.length;i++)
        {
            if(minClass>prices[i]) minClass=prices[i];
            
            int profit=prices[i]-minClass;

            if(max<profit) max=profit;
        }

        return max; }}
