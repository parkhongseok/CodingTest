package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 타일01_1904 {
  static int n;
  static int[] dp;

  static void initDp(){
    dp[0] = 1;
    dp[1] = 2;
    for (int i = 2; i < n+1; i++){
      dp[i] = (dp[i-1] + dp[i-2])%15746;
    }
  }

  public static void main(String[] args) throws NumberFormatException, IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    n = Integer.parseInt(br.readLine());
    dp = new int[n+1];
    initDp();
    System.out.println(dp[n-1]);
  }
}