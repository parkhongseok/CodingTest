package java_test.조합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.io.StringReader;

public class 팩토리얼_10872 {
  static int maxN = 13;
  static int[] dp = new int[maxN];
  static String test = "10";

  static void getDp(){
    dp[0] = 1;
    for (int i = 1; i < maxN; i++){
      dp[i] = dp[i-1]*i;
    }
  }

  public static void main(String[] args) throws IOException {
    // StringReader sr = new StringReader(test);
    InputStreamReader sr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(sr);
    int N = Integer.parseInt(br.readLine());

    getDp();

    System.out.println(dp[N]);
  }
}