package basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 귤고르기2 {

  public static int solution(int k, int[] tangerine) {
    int answer = 0;
    Map<Integer, Integer> map = new HashMap<>();
    for (int t : tangerine){
      map.put(t, map.getOrDefault(t, 0)+1);
    }

    List<Integer> keys = new ArrayList<>(map.keySet());

    return answer;
  }

    public static void main(String[] args) {
      int[] L = {1, 3, 2, 5, 4, 5, 2, 3};
      int k = 6;
      System.out.println(solution(k, L));
    }
}