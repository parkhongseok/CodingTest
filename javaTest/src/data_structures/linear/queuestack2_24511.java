package data_structures.linear;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class queuestack2_24511 {
  static StringBuilder sb = new StringBuilder();
  static String test = """
5
1 1 1 1 1
1 2 3 4 5
3
1 3 5
""";

  public static void main(String[] args) throws NumberFormatException, IOException {
    StringReader sr = new StringReader(test);
    // InputStreamReader sr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(sr);

    int N = Integer.parseInt(br.readLine());
    int[] A = new int[N];
    int[] B = new int[N];
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++){
      A[i] = Integer.parseInt(st.nextToken());
    }
    
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++){
      B[i] = Integer.parseInt(st.nextToken());
    }

    Deque<Integer> D = new ArrayDeque<>();
    for (int i = 0; i < N; i++){
      if (A[i] == 0){
        D.addLast(B[i]);
      }
    }
    
    int M = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < M; i++){
      int c = Integer.parseInt(st.nextToken());
      D.addFirst(c);
      sb.append(D.pollLast()).append(" ");
    }

    System.out.println(sb);
  }
}
