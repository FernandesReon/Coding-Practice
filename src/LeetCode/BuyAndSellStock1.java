package LeetCode;
// LeetCode 121
public class BuyAndSellStock1 {
    public static void main(String[] args){
        BuyAndSellStock1 sellStock1 = new BuyAndSellStock1();
        int[] prices = {7,1,5,3,6,4};

        int maxProfit = sellStock1.maxProfit(prices);
        System.out.println(maxProfit);
    }

    public int maxProfit(int[] prices) {
        /*
            So to figure out which day we should sell our stock so that we get maximum profit,
            We will have to buy the stock at cheaper rate and sell at higher rate, Okay...
         */

        // initially we start buying from day 1 and selling on day 2
        int buy = 0, sell = 1;
        // for now the maxProfit is zero
        int maxProfit = 0;

        // check for selling day as long as it is less than the length of array
        while (sell < prices.length){
            /*
            If the selling price is more than buying price
            calculate the profit and find the maxProfit
             */
            if (prices[sell] > prices[buy]){
                int profit = prices[sell] - prices[buy];
                maxProfit = Math.max(maxProfit, profit);
            }
            else {
                // found lower price - better to buy here
                buy = sell;
            }
            // move to next day
            sell++;
        }
        return maxProfit;
    }
}
