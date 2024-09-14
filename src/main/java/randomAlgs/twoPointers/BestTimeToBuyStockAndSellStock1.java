package randomAlgs.twoPointers;

public class BestTimeToBuyStockAndSellStock1 {

    public static int maxProfit(int[] prices) {

        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            int start = i;
            int end = prices.length - 1;
            while (start < end) {
                if ((prices[end] - prices[start]) > profit) {
                    profit = prices[end] - prices[start];
                }
                end--;
            }
        }
        return profit;
    }


    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        int result = maxProfit(prices);
        System.out.println(result);
    }
}
