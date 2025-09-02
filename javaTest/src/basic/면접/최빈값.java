package basic.면접;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* 정수 배열의 최빈값(동률 시 더 작은 수) 구하기, 없으면 -1 */
public class 최빈값 {
  
  public int solution(int[] arr){
    Map<Integer, Integer> map = new HashMap<>();

    for (int x : arr){
      map.put(x, map.getOrDefault(x, 0) + 1);
    }

    int maxKey = 1;
    int maxValue = 1;
    for (Entry<Integer, Integer> e : map.entrySet()){
      if (e.getValue() > maxValue){
        maxKey = e.getKey();
        maxValue = e.getValue();
      }
    }

    return maxKey;
  }

  // public int solution2(int[] arr){
  // }

  public static void main(String[] args) {
    최빈값 s = new 최빈값();
    int[] arr = new int[]{1, 2, 3, 2, 2, 3, 3, 3, 9};

    System.out.println("=== 1. ===");
    System.out.println(s.solution(arr));

    // System.out.println("=== 2. ===");
    // System.out.println(s.solution(arr));
  }
}
