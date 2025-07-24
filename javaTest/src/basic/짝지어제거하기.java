package basic;

import java.util.ArrayList;
import java.util.List;

public class 짝지어제거하기 {
      public static int solution(String s){
        List<Character> L = new ArrayList<>();

        for (int i = 0; i < s.length(); i++){
          char x = s.charAt(i);
          int stackLen = L.size();
          if (L.isEmpty() || L.get(stackLen - 1 ) != x){
            L.add(x);
          } else {
            L.remove(stackLen - 1);
          }
        }

        return L.isEmpty() ? 1 : 0;
    }

    public static void main(String[] args) {
      System.out.println(solution("cdcd"));
    }
}
