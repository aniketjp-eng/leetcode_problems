class Solution {
  public static int fibo(int n, int[] dp) {
        if (n == 0) {
            return 0;
        }
        if (dp[n] != 0) {
            return dp[n];
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int ans = fibo(n - 1, dp) + fibo(n - 2, dp);
        dp[n] = ans;
        return ans;
    }

    public static int climbStairs(int n) {
        int[] dp = new int[n + 2];
        return fibo(n + 1, dp);
    }
}