package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class 정수삼각형_1932 {
  static String test = """
5
7
3 8
8 1 0
2 7 4 4
4 5 2 6 5
""";

static void print(int[][] L){

  for (int i = 0; i < L.length; i++){
    for (int j = 0; j < i + 1; j++){
      System.out.print(L[i][j] + " ");
    }
    System.out.println();
  }
}

public static void main(String[] args) throws NumberFormatException, IOException {
  // given
  StringReader sr = new StringReader(test);
  // InputStreamReader sr = new InputStreamReader(System.in);
  BufferedReader br = new BufferedReader(sr);
  StringTokenizer st;

  int n = Integer.parseInt(br.readLine());
  int[][] triangle = new int[n][n];
  int[][] dp = new int[n][n];

  for (int i = 0; i < n; i++){
    st = new StringTokenizer(br.readLine());
    for (int j = 0; j < i + 1; j++){
      triangle[i][j] = Integer.parseInt(st.nextToken());
    }
  }

  // when
  dp[0][0] = triangle[0][0];
  for (int i = 1; i < n; i++){
    for (int j = 0; j < i + 1; j++){
      if (j == 0){
        dp[i][j] += triangle[i][j] + dp[i-1][j];
      } else if (j == i){
        dp[i][j] += triangle[i][j] + dp[i-1][j-1];
      } else {
        dp[i][j] += triangle[i][j] + Math.max(dp[i-1][j-1], dp[i-1][j]);
      }
    }
  }

  // then
  int answer = 0;
  for (int j = 0; j < n; j++){
    answer = Math.max(answer, dp[n-1][j]);
  }
  System.out.println(answer);
  }
}