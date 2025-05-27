package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class 포도주시식_2156 {
  static String test = """
5
10
10
1
10
10  
""";

static void print(int[] L ){
    for (int i = 0; i < L.length; i++){
    System.out.print(L[i] + " ");
  }
  System.out.println();
}

static int solve(int[] wine, int n){
  if (n == 1) return wine[0];
  if (n == 2) return wine[0] + wine[1];
  
  // dp table
  int[] dp = new int[n];
  
  // init
  dp[0] = wine[0];
  dp[1] = wine[0] + wine[1];
  dp[2] = Math.max(dp[1], dp[0] + wine[2]);

  for (int i = 3; i < n; i++){
    int drinkNow = Math.max(wine[i] + dp[i-2], wine[i] + wine[i-1] + dp[i-3]);
    dp[i] = Math.max(dp[i-1], drinkNow);
  }

  return dp[n-1];
}


  public static void main(String[] args) throws NumberFormatException, IOException {
    // given
    StringReader sr = new StringReader(test);
    // InputStreamReader sr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(sr);
    int n = Integer.parseInt(br.readLine());
    
    int[] wine = new int[n];
    for (int i = 0; i < n; i++){
      wine[i] = Integer.parseInt(br.readLine());
    }

    // when
    int answer = solve(wine, n);

    // then
    System.out.println(answer);
  }
}
