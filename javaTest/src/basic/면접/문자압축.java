package basic.면접;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class 문자압축 {
  public void solution1(String str){
    StringBuilder out = new StringBuilder();
    Map<Character, Integer> map = new LinkedHashMap<>();

    for (char c : str.toCharArray()){
      map.put(c, map.getOrDefault(c, 0)+1);
    }

    for (Entry<Character, Integer> e : map.entrySet()){
      out.append(e.getKey()).append(e.getValue());
    }

    System.out.println(out);
  }

  
  public void solution2(String str){

  }

  public static void main(String[] args) {
    문자압축 s = new 문자압축();

    String str = "aaaabbbc";

    System.out.println("=== 1. ===");
    s.solution1(str);

    System.out.println("=== 2. ===");
    s.solution2(str);
  }
}
