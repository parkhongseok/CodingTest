package basic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class 튜플 {


  public int[] solution(String s) {

    // 파싱 및 Set 생성
    List<Set<Integer>> list = new ArrayList<>();

    for (String line : s.substring(2, s.length()-2).split("\\},\\{")){
      Set<Integer> set = new HashSet<>();
      for (String x : line.split(",")){
        set.add(Integer.parseInt(x));
      }
      list.add(set);
    }

    // 정렬
    list.sort(Comparator.comparingInt(Set::size));

    // 정답 생성
    // LinkedHashSet은 순서를 보장하면서 중복 x
    Set<Integer> addedNumbers = new LinkedHashSet<>();
    for (Set<Integer> set : list) {
        for (Integer number : set) {
            addedNumbers.add(number);
        }
    }

    //then
    int[] answer = new int[addedNumbers.size()];
    int i = 0;
    for (Integer number : addedNumbers) {
        answer[i++] = number;
    }

    return answer;
  }
  

  public static void main(String[] args) {
    튜플 T = new 튜플();

    String s = "{{4,2,3},{3},{2,3,4,1},{2,3}}";
    
    int[] answer = T.solution(s);
  }
}
