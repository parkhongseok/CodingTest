package data_structures.linear;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class queuestack_24511 {
  static StringBuilder sb = new StringBuilder();
  static String test = """
5
1 1 1 1 1
1 2 3 4 5
3
1 3 5
""";

  static int getQueStack(int N, int[] A, int[] B, int c){
    int x = c;
    for (int i = 0; i < N; i++){
      if (A[i] == 1) continue;
      int temp = x;
      x = B[i];
      B[i] = temp;
    }

    return x;
  }

  static void print(int[] L){
    for (int l: L){
      System.out.print(l + " ");
    }
    System.out.println();
  }

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
    
    int M = Integer.parseInt(br.readLine());
    int[] C = new int[M];
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < M; i++){
      C[i] = Integer.parseInt(st.nextToken());
    }

    // print(A);
    // print(C);
    
    int x;
    for (int c : C){
      x = getQueStack(N, A, B, c);
      sb.append(x).append(" ");
    }
    System.out.println(sb);
  }
}
