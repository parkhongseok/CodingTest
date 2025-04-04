package back_tracking;

import java.util.Scanner;

class N과M15649 {
  static void fx(int N, int M, String S){
    if (M < 1){
      System.out.println(S);
      return;
    }
    for (int i = 1; i <= N; i++){
      if (!S.contains(i+"")){
        fx(N, M-1, S+i+" ");
      }
    }
  }

  public static void main(String[] args) {

    String input = "4 4";
    Scanner sc = new Scanner(input);
    int N = sc.nextInt();
    int M = sc.nextInt();

    fx(N, M, "");

  }
}