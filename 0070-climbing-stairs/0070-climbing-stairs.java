class Solution {
  public static int fibo(int n, int[] dp) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        if (dp[n] != 0) return dp[n];
        dp[n] = fibo(n - 1, dp) + fibo(n - 2, dp);
        return dp[n];
    }

    public static int climbStairs(int n) {
        int[] dp = new int[n + 2];
        return fibo(n + 1, dp);
    }
}