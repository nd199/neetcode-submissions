class Solution {
    public int maxProfit(int[] prices) {
        int mP = prices[0], maxProfit = 0;
        
        for(int p : prices) {
            mP = Math.min(mP, p);
            maxProfit = Math.max(maxProfit, p - mP);
        }

        return maxProfit;
    }
}
