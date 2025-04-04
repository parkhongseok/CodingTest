package combination;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class 다리놓기_1010 {
  static StringBuilder sb = new StringBuilder();
  static int T, N, M;
//   static String test = """
// 4
// 2 2
// 1 5
// 3 7
// 13 29""";
  // int 자료형 초과 이슈
  static BigInteger getCombination(int n, int k){
    BigInteger nPk = BigInteger.ONE;
    for (int i=(n-k+1); i<n+1; i++)
      nPk = nPk.multiply(BigInteger.valueOf(i));

    BigInteger[] dp = new BigInteger[k+1];
    dp[0] = BigInteger.ONE;
    for (int i = 1; i < k+1; i++)
      dp[i] = dp[i-1].multiply(BigInteger.valueOf(i));

    System.out.println("n : %d, k : %d".formatted(n, k));
    System.out.println("nPk : %d, dpK : %d".formatted(nPk, dp[k]));
    return nPk.divide(dp[k]);
  }
  
  public static void main(String[] args) throws IOException {
    // StringReader sr = new StringReader(test);
    InputStreamReader sr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(sr);
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    T = Integer.parseInt(st.nextToken());
    
    for (int i = 0; i < T; i++){
      st = new StringTokenizer(br.readLine());
      N = Integer.parseInt(st.nextToken());
      M = Integer.parseInt(st.nextToken());
      System.out.println("N : %d, M : %d".formatted(N, M));
      sb.append(getCombination(M, (M-N < N) ? M-N : N)).append('\n');
    }

    System.out.println(sb);
  }
}