package basic;

public class 멀리뛰기 {
  public static long solution(int n) {
    long[] dp = new long[n+1];
    dp[0] = dp[1] = 1;
    
    for (int i = 2; i < n + 1; i++){
      dp[i] = (dp[i-1] + dp[i-2])%1234567;
    }

    return dp[n];
  }

  public static void main(String[] args) {
    System.out.println(solution(4));
  }
}
