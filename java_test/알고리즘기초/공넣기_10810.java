package java_test.알고리즘기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 공넣기_10810 {
  static int N, M;
  static List<Integer> Numbers, answer;
  static StringBuilder sb = new StringBuilder();
  static String test = """
5 4
1 2 3
3 4 4
1 4 1
2 2 2
""";

  public static void main(String[] args) throws IOException {
    StringReader sr = new StringReader(test);
    // InputStreamReader isb = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(sr);
    StringTokenizer st = new StringTokenizer(br.readLine());

    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    Numbers = new ArrayList<>();

  }
}
