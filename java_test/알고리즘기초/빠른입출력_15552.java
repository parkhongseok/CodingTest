package java_test.알고리즘기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.io.StringReader;
import java.util.StringTokenizer;

public class 빠른입출력_15552 {
  static int T, N, M;
  static int[] arr, answer;
  static StringBuilder sb = new StringBuilder();
//   static String test = """
// 5
// 1 1
// 12 34
// 5 500
// 40 60
// 1000 1000
// """;

  public static void main(String[] args) throws IOException{
    // StringReader sr = new StringReader(test);
    InputStreamReader sr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(sr);
    StringTokenizer st = new StringTokenizer(br.readLine());
    T = Integer.parseInt(st.nextToken());
    for (int i = 0; i < T; i++){
      st = new StringTokenizer(br.readLine());
      N = Integer.parseInt(st.nextToken());
      M = Integer.parseInt(st.nextToken());
      sb.append(N+M).append('\n');
    }
    System.out.println(sb);
  }
}
