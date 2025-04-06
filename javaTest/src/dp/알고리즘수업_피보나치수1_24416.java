package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 알고리즘수업_피보나치수1_24416 {
  static class Fibbo{
    int n, dpCount, fibboN;

    Fibbo(int n){
      this.n = n;
      this.dpCount = 0;
      this.fibboN = getDp(n);
    }

    int getDp(int N){
      int[] dp = new int[N+1];
      dp[1]=dp[2]=1;

      for (int i = 3; i < N+1; i++){
        dp[i] = dp[i-1] + dp[i-2];
        this.dpCount ++;
      }
      return dp[N];
    }
  }

  public static void main(String[] args) throws IOException {
    StringBuilder sb = new StringBuilder();
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    int N = Integer.parseInt(br.readLine());
    Fibbo F = new Fibbo(N);
    sb.append(F.fibboN).append(' ').append(F.dpCount);
    System.out.println(sb);
  }
}
