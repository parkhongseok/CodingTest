package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.io.StringReader;
import java.util.StringTokenizer;

public class add_1000 {
  static int N, M;
  static int[] arr, answer;
  static StringBuilder sb = new StringBuilder();
//   static String test = """
// 3 2
// """;

  public static void main(String[] args) throws IOException{
    // StringReader sr = new StringReader(test);
    InputStreamReader sr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(sr);
    StringTokenizer st = new StringTokenizer(br.readLine());

    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    sb.append(N+M);
    System.out.println(sb);
  }
}
