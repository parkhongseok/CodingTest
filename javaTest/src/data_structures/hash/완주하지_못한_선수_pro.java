package data_structures.hash;

import java.util.HashMap;
import java.util.Map;

public class 완주하지_못한_선수_pro {
      public static String solution(String[] participant, String[] completion) {
        String answer = "";
        
        // given
        Map<String, Integer> map = new HashMap<>();

        // when
        for (String name : participant){
          int cnt;
          if (map.get(name) == null)
            cnt = 1;
          else
            cnt = map.get(name) + 1;
          map.put(name, cnt);
        }

        for (String name : completion){
          int cnt = map.get(name) - 1;
          map.put(name, cnt);
        }
        System.out.println(map);
        // then
        for (Map.Entry<String, Integer> entry : map.entrySet()){
          if (entry.getValue() != 0){
            answer += entry.getKey();
          }
        }

        return answer;
      }

    public static void main(String[] args) {
      String[] participant = {"mislav", "stanko", "mislav", "ana"};
      String[] completion = {"stanko", "ana", "mislav"};
      String str = solution(participant, completion);
      System.out.println(str);
    }
}
