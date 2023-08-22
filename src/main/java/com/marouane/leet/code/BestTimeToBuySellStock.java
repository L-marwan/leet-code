package com.marouane.leet.code;

public class BestTimeToBuySellStock {

    public static int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int bestProfit = 0;
        for (int price : prices) {
            if (buyPrice > price) {
                buyPrice = price;
            }
            if (price - buyPrice > bestProfit)
                bestProfit = price - buyPrice;
        }
        return bestProfit;
    }
}
