package basic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
// "110010101001"	[3,8]
public class 자릿수_더하기 {
  static public int solution(int n) {

    int cnt = 0;

    // 전처리
    int[] S = new int[n+1];
    for (int i = 1; i < n+1; i++){
      S[i] = S[i-1] + i;
    }

    // then
    for (int i = 1; i < n+1; i++){
      for (int j = i; j < n+1; j++){
        System.out.println(" " + i + " " + j);
        int sum = S[j] - S[i-1];
        if (sum == n){
          cnt++;
          System.out.println("S: " + i + " " + j);
          break;
        }
        if (sum >= n){
          System.out.println("F: " + i + " " + j);
          break;
        }
      }
    }

    return cnt;
  }

  public static void main(String[] args) {
    System.out.println(solution(15));
  }
}