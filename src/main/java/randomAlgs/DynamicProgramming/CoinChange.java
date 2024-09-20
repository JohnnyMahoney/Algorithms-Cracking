package randomAlgs.DynamicProgramming;

public class CoinChange {
    public static int coinChange(int[] coins, int total) {

        int[] dp = new int[total + 1];

        for (int i = 1; i <= total; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

        for (int coin : coins) {
            for (int i = coin; i <= total; i++) {
                if (dp[i - coin] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        return dp[total] == Integer.MAX_VALUE ? -1 : dp[total];

    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 7};
        int result = coinChange(arr, 6);
        System.out.println(result);
    }
}
