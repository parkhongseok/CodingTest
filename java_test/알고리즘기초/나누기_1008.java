package java_test.알고리즘기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.io.StringReader;
import java.util.StringTokenizer;

public class 나누기_1008 {
  static Double N, M;
  static StringBuilder sb = new StringBuilder();
//   static String test = """
// 1 3
// """;

  public static void main(String[] args) throws IOException{
    // StringReader sr = new StringReader(test);
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    StringTokenizer st = new StringTokenizer(br.readLine());

    N = Double.parseDouble(st.nextToken());
    M = Double.parseDouble(st.nextToken());
    sb.append(N/M);
    System.out.println(sb);
  }
}
