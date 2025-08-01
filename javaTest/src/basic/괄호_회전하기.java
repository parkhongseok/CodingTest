package basic;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class 괄호_회전하기 {
  static Map<Character, Character> pair;

  static void initMap(){
    pair = new HashMap<>();
    pair.put(']', '[');
    pair.put('}', '{');
    pair.put(')', '(');
  }

  static boolean isCollectBracket(Deque<Character> chars){
    Deque<Character> stack = new ArrayDeque<>();

    for (char c : chars){

      if (stack.isEmpty() || pair.containsValue(c)){
        stack.push(c);
        continue;
      }
      if (stack.peek() != pair.get(c) ){ return false; }

      stack.pop();
    }

    return stack.size() == 0 ? true : false;
  }


  public static int solution(String s) {
    // init
    initMap();
    int answer = 0;
    int len =  s.length();

    Deque<Character> chars = new ArrayDeque<>();
    for (char c : s.toCharArray()){
      chars.add(c);
    }

    //when
    for (int i = 0; i < len; i++){
      if (isCollectBracket(chars)) {answer++;}
      chars.addLast(chars.removeFirst());
    }
      return answer;
  }

  public static void main(String[] args) {
    int x = solution("[](){}");
    System.out.println(x);
  }
}
