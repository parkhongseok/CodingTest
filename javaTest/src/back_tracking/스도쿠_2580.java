package back_tracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class 스도쿠_2580 {
  static StringBuilder sb = new StringBuilder();
  static String test = """
0 3 5 4 6 9 2 7 8
7 8 2 1 0 5 6 0 9
0 6 0 2 7 8 1 3 5
3 2 1 0 4 6 8 9 7
8 0 4 9 1 3 5 0 6
5 9 6 8 2 0 4 1 3
9 1 7 6 5 2 0 8 0
6 0 3 7 0 1 9 5 2
2 5 8 3 9 4 7 6 0
""";

static void print(int[][] L){
  for (int[] line : L){
    for (int item : line){
      sb.append(item).append(" ");
    }
    sb.append('\n');
  }
  System.out.println(sb);
}

static void solve()

static int[] checkRow(int[] row){
  
}

public static void main(String[] args) throws IOException {
  StringReader sr = new StringReader(test);
  // InputStreamReader sr = new InputStreamReader(System.in);
  BufferedReader br = new BufferedReader(sr);
  StringTokenizer st;
  int N = 9;
  int[][] board = new int[N][N];
  for (int i = 0; i < N; i++){
    st = new StringTokenizer(br.readLine());
    for (int j = 0; j < N; j++){
      board[i][j] = Integer.parseInt(st.nextToken());
    }
  }

  print(board);








}
}
