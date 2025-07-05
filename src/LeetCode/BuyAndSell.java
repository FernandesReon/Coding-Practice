package LeetCode;

public class BuyAndSell {
    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
        int result = maxProfit(prices);
        System.out.println(result);
    }

    /*
    * The goal is to buy the stock at lower price and sell it at higher price
    * */
    public static int maxProfit(int[] prices){
        int maxProfit = 0;
        int buy = 0, sell = 1;

        // loop until last price in array
        while (sell < prices.length){
            // if sell price greater than buy price
            if (prices[sell] > prices[buy]){
                // calculate the profit
                int profit = prices[sell] - prices[buy];
                // Get the maxProfite
                maxProfit = Math.max(maxProfit, profit);
            }
            else {
                // Condition where buying and selling stock on same day
                buy = sell;
            }
            // Check for other day ahead
            sell++;
        }
        return maxProfit;
    }
}
