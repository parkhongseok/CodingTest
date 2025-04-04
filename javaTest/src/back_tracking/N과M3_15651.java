package back_tracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class N과M3_15651 {
    // sysout.print는 정말 느리기 때문에 이 결과를 모아서 한 번에 출력
  static StringBuilder sb = new StringBuilder();

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    sc.close();


    back(N, M, new ArrayList<>());
    System.out.print(sb.toString());
  }


  public static void back(int N, int M, List<Integer> answers){
    if (answers.size() == M){
      for (int item : answers){
        sb.append(item).append(' ');
      }
      sb.append('\n');
      return;
    }
    for (int i = 1; i <= N; i++){
      answers.add(i);
      back(N, M, answers);
      answers.remove(answers.size()-1);
    }
  } 
}