class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit =0;
        int profit_if_sold_today =0;

        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min = prices[i];
            }

            profit_if_sold_today = prices[i]-min;
            if(profit_if_sold_today>profit){
                profit = profit_if_sold_today;
            }
        }
        return profit;
    }
}