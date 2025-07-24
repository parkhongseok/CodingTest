package basic;

import java.util.Arrays;

public class 구명보트2_two_pointer_방식 {
    public static int solution(int[] people, int limit) {
      Arrays.sort(people);
      int boatCount = 0;
      int left = 0;
      int right = people.length - 1;

      while (left <= right){
        if (people[right] + people[left] <= limit){
          left++;
        }
        right--;
        boatCount++;
      }

      return boatCount;
    }

    public static void main(String[] args) {
      int[] P = new int[]{70, 50, 80, 50};
      int L = 100;
      System.out.println(solution(P, L));
    }
}
