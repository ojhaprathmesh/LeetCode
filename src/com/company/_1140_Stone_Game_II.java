package com.company;

public class _1140_Stone_Game_II {
    public int stoneGameII(int[] piles) {
        int n = piles.length;
        int[] prefixSum = new int[n + 1];

        // Compute prefix sums
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + piles[i];
        }

        // Initialize DP table
        int[][] dp = new int[n + 1][n + 1];

        // Fill the DP table
        for (int i = n - 1; i >= 0; i--) {
            for (int m = 1; m <= n; m++) {
                int maxStones = 0;
                int totalStones = 0;
                for (int x = 1; x <= 2 * m; x++) {
                    if (i + x > n) break;
                    totalStones = prefixSum[i + x] - prefixSum[i];
                    if (i + x < n) {
                        maxStones = Math.max(maxStones, totalStones - dp[i + x][Math.max(m, x)]);
                    } else {
                        maxStones = Math.max(maxStones, totalStones);
                    }
                }
                dp[i][m] = maxStones;
            }
        }

        return dp[0][1];
    }

    public static void main(String[] args) {
        _1140_Stone_Game_II game = new _1140_Stone_Game_II();

        int[] piles1 = {2, 7, 9, 4, 4};
        System.out.println(game.stoneGameII(piles1));  // Output: 10

        int[] piles2 = {1, 2, 3, 4, 5, 100};
        System.out.println(game.stoneGameII(piles2));  // Output: 104
    }
}