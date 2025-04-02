package java_test.알고리즘기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class X보다_작은_수_10871 {
  static int N, X;
  static List<Integer> Numbers, answer;
//   static String test = """
// 10 5
// 1 10 4 9 2 3 8 5 7 6
// """;
  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) throws IOException{
    // StringReader sr = new StringReader(test);
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    StringTokenizer st = new StringTokenizer(br.readLine());

    N = Integer.parseInt(st.nextToken());
    X = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    Numbers = new ArrayList<>();
    for (int i = 0; i < N ; i++){
      int T = Integer.parseInt(st.nextToken());
      Numbers.add(T);
    }

    for (int num : Numbers){
      if (num < X){
        sb.append(num).append(" ");
      }
    }

    System.out.println(sb);



  }

}
