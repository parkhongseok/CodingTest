package basic;

public class 점프와순간이동 {
  public static int solution(int n) {
    // given
    int[] dp = new int[n+1];
    // when
    for (int i = 1; i < n+1; i++)
        dp[i] = (i%2 == 1) ? dp[i-1]+1 : dp[i/2];
    // then
    return dp[n];
  }

  public static void main(String[] args) {
    System.out.println(solution(5000));
  }
}
