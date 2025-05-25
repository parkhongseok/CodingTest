package back_tracking;

import java.util.Scanner;

public class N_Queen_9663 {
  static int cnt = 0;

  public static boolean isValid(int[] L, int row, int col){
    
    for (int i = 0; i < row; i++){
      if (L[i] == col) return false;
      if (L[i]+i == col + row) return false;
      if (L[i]-i == col - row) return false;
    }

    return true;
  }

  public static void f(int[] L, int row){
    int N = L.length;
    
    if (row == L.length){
      cnt++;
      return;
    }
    
    for (int col = 0; col < N; col++){
      if (isValid(L, row, col)){
        L[row] = col;
        f(L, row++);
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] L = new int[N]; // 각 행에 어떤 열에 퀸이 있는지 저장
    f(L, 0);
    System.out.println(cnt);
  }
}
