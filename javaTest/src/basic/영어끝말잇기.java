package basic;

import java.util.HashSet;
import java.util.Set;

public class 영어끝말잇기 {
  public static int[] solution(int n, String[] words) {
    int[] answer = {0, 0};
    Set<String> isOccupied = new HashSet<>();

    isOccupied.add(words[0]);
    for (int i = 1; i < words.length; i++){
      String before = words[i-1];
      String now = words[i];

      if ((before.charAt(before.length()-1) != now.charAt(0)) || isOccupied.contains(now)){
        answer[0] = i%n + 1; 
        answer[1] = i/n + 1;
        return answer;
      }

      isOccupied.add(now);
    }

    return answer;
  }

  public static void main(String[] args) {
    int n = 2;
    String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};
    int[] L = solution(n, words);

    for (int x : L){
      System.out.println(x);
    }

  }
}
