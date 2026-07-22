class Solution {
    public int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i : prices){
            minprice = Math.min(minprice, i);
            maxprofit = Math.max(maxprofit, (i - minprice));
        }
        return maxprofit;
    }
}