package basic;

import java.util.HashMap;
import java.util.Map;

public class 의상 {
  public static int solution(String[][] clothes) {
    Map<String, Integer> map = new HashMap<>();

    for (String[] clothe : clothes){
      map.put(clothe[1], map.getOrDefault(clothe[1], 0) + 1);
    }
    int answer = 1;
    for (String item : map.keySet()){
      answer *= map.get(item)+1;
    }
    return answer-1 ;
  }

  public static void main(String[] args) {
    String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
    int answer = solution(clothes);
    System.out.println(answer);
  }
}
