package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class 신나는함수실행_9184 {
  static int a, b, c;
  static int size = 21;
  static int[][][] dp = new int[size][size][size];
  static StringBuilder output = new StringBuilder();
  static String test = """
1 1 1
2 2 2
10 4 6
50 50 50
-1 7 18
-1 -1 -1
      """;

  static void initDp(){
    for (int i = 0; i < size; i++)
      for (int j = 0; j < size; j++)
        for (int k = 0; k < size; k++){
          if (i == 0 || j == 0 || k == 0)
            dp[i][j][k] = 1;
          else if (i < j && j < k)
            dp[i][j][k] = dp[i][j][k-1] + dp[i][j-1][k-1] - dp[i][j-1][k];
          else
            dp[i][j][k] = dp[i-1][j][k] + dp[i-1][j-1][k] + dp[i-1][j][k-1] - dp[i-1][j-1][k-1];
        }
  }

  static int w(int a, int b, int c){
    if (a <= 0 || b <= 0 || c <= 0)
      return 1;
    if (a > 20 || b > 20 || c > 20)
      return dp[20][20][20];
    return dp[a][b][c];
    
  }

  public static void main(String[] args) throws IOException {
    initDp();
    
    StringReader sr = new StringReader(test);
    // InputStreamReader sr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(sr);
    
    while(true){
      StringTokenizer st = new StringTokenizer(br.readLine());
      a = Integer.parseInt(st.nextToken());
      b = Integer.parseInt(st.nextToken());
      c = Integer.parseInt(st.nextToken());
      if (a == -1 && b == -1 && c == -1)
        break;
      if (output.length() > 0)
        output.append("\n");

      output.append(String.format("w(%d, %d, %d) = %d", a, b, c, w(a, b, c)));
    }
    System.out.println(output);
  }
}