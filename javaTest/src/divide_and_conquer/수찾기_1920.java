package divide_and_conquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class 수찾기_1920 {
  static int N, M;
  static List<Integer> A = new ArrayList<>(), B = new ArrayList<>();
  static String test = """
5
4 1 5 2 3
5
1 3 7 9 5
""";

  static StringBuilder sb = new StringBuilder();

  static int f(List<Integer> A, int a, int b, int k){
    // System.out.printf("[k : %d] [a : %d], [b : %d] \n", k, a, b);
    // 탈출 조건 
    if (a > b){
      return 0;
    }

    int mid  = a + (b-a)/2;
    if (A.get(mid) > k){
      return f(A, a, mid-1, k);
    }
    else if (A.get(mid) < k){
      return f(A, mid + 1, b, k);
    }else{
      // A.get(mid) == k
      return 1;
    }
  }


  public static void main(String[] args) throws IOException {
    StringReader sr = new StringReader(test);
    // InputStreamReader sr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(sr);
    StringTokenizer st;

    N = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i ++){
      A.add(Integer.parseInt(st.nextToken()));
    }
    
    M = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i ++){
      B.add(Integer.parseInt(st.nextToken()));
    }
    
    // 정렬 필수
    Collections.sort(A);

    for (int k : B){
      sb.append(f(A, 0, N-1, k)).append('\n');
    }
    System.out.println(sb.toString().trim());
  }
}
