package basic;

import java.util.ArrayList;
import java.util.List;

public class 카펫 {
  public static int[] solution(int brown, int yellow) {
    int[] answer = {0 ,0};
    int sum = brown + yellow;
    List<int[]> L = new ArrayList<>();

    // 1. 인수 분해
    for (int i = 2; i*i < sum + 1; i++){
      if (sum%i != 0) {
        continue;
      }
      int[] xy = {(sum/i), i};
      L.add(xy);
      System.out.println(xy[0] + " " + xy[1]);
    }

    // 2. 테두리 조건 만족하는 인수 쌍 찾기
    for (int[] xy : L){
      if (2*(xy[0] + xy[1]) -4 > brown){ continue; }
      answer = xy;
      break; 
    }
    return answer;
  }

  public static void main(String[] args) {
    int[] L = solution(18, 6); // 8, 6 
    System.out.println(L[0] + " " + L[1]);
  }
}
