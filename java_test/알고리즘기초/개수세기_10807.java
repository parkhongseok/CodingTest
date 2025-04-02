package java_test.알고리즘기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 개수세기_10807{
  static StringBuilder sb = new StringBuilder();
  static int N, v, answer;
  static List<Integer> Numbers;
//   static String test = """
// 11
// 1 4 1 2 4 2 4 2 3 4 4
// 5
//       """;

  public static void main(String[] args) throws IOException{
    // StringReader sr = new StringReader(test);
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    StringTokenizer st = new StringTokenizer(br.readLine());

    N = Integer.parseInt(st.nextToken());
    Numbers = new ArrayList<>();
    st = new StringTokenizer(br.readLine());
    for (int i = 0 ; i < N; i++){
      int T = Integer.parseInt(st.nextToken());
      Numbers.add(T);
    }
    st = new StringTokenizer(br.readLine());
    v = Integer.parseInt(st.nextToken());
    
    answer = 0;
    for (int num : Numbers){
      if (num == v){
        answer ++;
      }
    }
    System.out.println(answer);
  }
}