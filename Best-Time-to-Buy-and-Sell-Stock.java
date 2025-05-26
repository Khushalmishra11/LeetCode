class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        // for(int i = 0 ; i< prices.length; i++){
        //     for( int j = i+1; j<prices.length ; j++){
        //         if(prices[j]> prices[i]){
        //             int profit = prices[j] - prices[i];
        //             maxProfit = Math.max(profit, maxProfit);
        //         }
        //     }
        // }
        int lowestProfit = prices[0];
        for( int price : prices){
            if(price > lowestProfit){
                int profit = price - lowestProfit;
                maxProfit = Math.max(profit , maxProfit);
            }

            lowestProfit = Math.min(lowestProfit, price);
        }
        return maxProfit;
    }
}