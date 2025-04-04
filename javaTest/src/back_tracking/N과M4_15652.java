package back_tracking;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class N과M4_15652 {

  static void back(int N, int M, int now, List<Integer> answer){
    if (answer.size() == M){
      for (int num : answer){
        System.out.print(num + " ");
      }
      System.out.println();
      return;
    }
    for (int i = now; i <= N; i++){
      answer.add(i);
      back(N, M, i, answer);
      answer.remove(answer.size()-1);
    }
  }

  public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int M = sc.nextInt();

      back(N, M, 1, new ArrayList<>());
    }
}