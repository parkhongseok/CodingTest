package basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 귤고르기 {

  public static int solution(int k, int[] tangerine) {
    int answer = 0;
    Map<Integer, Integer> map = new HashMap<>();
    for (int x : tangerine){
      if (map.get(x) == null){
        map.put(x, 1);
      } else {
        map.put(x, map.get(x) + 1);
      }
    }
    // System.out.println(map);

    List<Map.Entry<Integer, Integer>> sorted = new ArrayList<>(map.entrySet());

    sorted.sort(Map.Entry.<Integer, Integer>comparingByValue().reversed());

    for (Map.Entry<Integer, Integer> entry : sorted) {
      // System.out.println(entry.getKey() + " = " + entry.getValue());

      if (k <= 0){  break;  }
      k -= entry.getValue();
      answer++;
    }
    return answer;
  }

    public static void main(String[] args) {
      int[] L = {1, 3, 2, 5, 4, 5, 2, 3};
      int k = 6;
      System.out.println(solution(k, L));
    }
}