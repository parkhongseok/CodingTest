package java_test.조합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class 이항계수_11050 {
  static int N, K;
  static String test = "5 3";

  static int getFactorial(){
    int[] dp = new int[K+1];
    dp[0] = 1;
    for (int i = 1; i < K+1; i++){
      dp[i] = dp[i-1]*i;
    }
    return dp[K];
  }

  static int getPermutation(){
    int nPk = 1;
    for (int i=(N-K+1); i<N+1; i++){
      nPk *= i;
    }
    return nPk;
  }

  public static void main(String[] args) throws IOException {
    // StringReader sr = new StringReader(test);
    InputStreamReader sr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(sr);

    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    K = Integer.parseInt(st.nextToken());
    
    System.out.println((int)getPermutation()/getFactorial());

  }
}
