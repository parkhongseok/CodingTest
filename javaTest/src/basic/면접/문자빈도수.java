package basic.면접;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class 문자빈도수 {
  public void solution(String str){
    Map<Character, Integer> map = new HashMap<>();

    for (char c : str.toCharArray()){
      map.put(c, map.getOrDefault(c, 0) + 1);
    }
    // System.out.println(map);
    for (Entry<Character, Integer> x : map.entrySet()){
      // System.out.println(String.format("%c : %d", x.getKey(), x.getValue()));
      System.out.printf("%c : %d%n", x.getKey(), x.getValue());
    }
  }

  public static void main(String[] args) {
    문자빈도수 s = new 문자빈도수();
    s.solution("banana");
  }
}
