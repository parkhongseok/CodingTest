package basic;

import java.util.Arrays;

public class 구명보트 {
    public static int solution(int[] people, int limit) {
      int cnt = 0;
      boolean[] occupied = new boolean[people.length];

      // 1. 정렬하기
      Arrays.sort(people);

      for (int i = 0; i < people.length; i++){
        if (occupied[i]) {continue;}
        occupied[i] = true;
        int nextIdx = -1;

        for (int j = i + 1; j < people.length; j++){
          if (occupied[j]) {continue;}
          if (people[i] + people[j] > limit) {break;}
          nextIdx = j;
        }
        ++cnt;
        if (nextIdx > 0)  {occupied[nextIdx] = true;}

      }

      return cnt;
    }

    public static void main(String[] args) {
      int[] P = new int[]{70, 80, 50};
      int L = 100;
      System.out.println(solution(P, L));
    }
}
