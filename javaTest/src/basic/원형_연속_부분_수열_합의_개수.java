
package basic;

import java.util.HashSet;
import java.util.Set;

public class 원형_연속_부분_수열_합의_개수 {
  public static int solution(int[] elements) {
    Set<Integer> set = new HashSet<>();
    int len = elements.length;

    for (int gap = 1; gap < len+1; gap++){
      for (int start = 0; start < len; start++){
        int sum = 0;
        for (int i = start; i < start + gap; i++){
          sum += elements[i%len];
        }
        set.add(sum);
      }
    }

    return set.size();
  }

  public static void main(String[] args) {
    int[] elements = {7,9,1,1,4}; //18
    System.out.println(solution(elements));
  }
  
}