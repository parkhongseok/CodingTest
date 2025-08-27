package basic;

import java.util.ArrayList;
import java.util.List;

public class 기능개발 {
  public static int[] solution(int[] progresses, int[] speeds) {
    List<Integer> arr = new ArrayList<>();

    int Day = 0;

    for (int i = 0; i < progresses.length; i++){

      int R = 100 - progresses[i];

      if (speeds[i]*Day >= R){
        arr.set(arr.size() - 1, arr.get(arr.size()-1)+1);
        continue;
      }

      arr.add(1);
      // Day += R%speeds[i]==0 ? R/speeds[i] : R/speeds[i] + 1;
      // Day += R/speeds[i] + R%speeds[i]==0 ? 0 : 1;
      Day = (R % speeds[i] == 0 ? 0 : 1) + R / speeds[i];
    }      
    System.out.println(arr);
    return arr.stream().mapToInt(i -> i).toArray();
  }

  public static void main(String[] args) {
    int[] P = {95, 93, 92};
    int[] S = {1, 1, 1};

    int[] answer = solution(P, S);

    for (int x : answer){
      System.out.print(x + " ");
    }
  }
  
}
