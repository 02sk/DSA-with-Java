
public class BestTimetoBuyandSellStock {
    public static int Max(int prices[]) {
        int n = prices.length;
        int buy = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < n; i++) {
            int sell = prices[i];
            int profit = sell - buy;

            maxProfit = Math.max(profit, maxProfit);
            buy = Math.min(buy, sell);
            
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        
        int result = Max(prices);
        System.out.println(" Total profit = " + result);
    }
}
