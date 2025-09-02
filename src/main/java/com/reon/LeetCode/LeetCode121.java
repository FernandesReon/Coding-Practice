package com.reon.LeetCode;
// Best Time to Buy and Sell Stock
public class LeetCode121 {
    public static void main(String[] args) {

    }
    /*
    buy a stock at lower price and sell it at higher price
    At point if the selling price is greater than buying price, calculate the profit,
        check if the profit is greater than max, if so max = profit
    a condition where buy and sell happens on same day
    increment the sell
    return the maxProfit
     */
    public int maxProfit(int[] prices) {
        int buy = 0, sell = 1, maxProfit = 0;

        while (sell < prices.length){
            if (prices[sell] > prices[buy]){
                int profit = prices[sell] - prices[buy];
//                if (maxProfit < profit) {
//                    maxProfit = profit;
//                }
                maxProfit = Math.max(maxProfit, profit);
            }
            else {
                buy = sell;
            }
            sell++;
        }
        return maxProfit;
    }

    // using for loop
    public int maxProfit2(int[] prices) {
        int arr_len = prices.length;
        int maxProfit = 0, buy_price = prices[0];

        for (int i = 1; i < arr_len; i++) {
            if (prices[i] > buy_price) {
                int profit = prices[i] - buy_price;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buy_price = prices[i];
            }
        }
        return maxProfit;
    }
}
