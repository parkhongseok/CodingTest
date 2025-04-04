package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.io.StringReader;
import java.util.StringTokenizer;

public class 사칙연산_10869 {
  static int N, M;
  // static int[] answer = new int[5];
  static StringBuilder sb = new StringBuilder();
//   static String test = """
// 7 3
// """;

  public static void main(String[] args) throws IOException{
    // StringReader sr = new StringReader(test);
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    StringTokenizer st = new StringTokenizer(br.readLine());

    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());

    sb.append(N+M).append('\n');
    sb.append(N-M).append('\n');
    sb.append(N*M).append('\n');
    sb.append(N/M).append('\n');
    sb.append(N%M).append('\n');
    System.out.println(sb);
  }
}
