package data_structures.hash;

import java.util.HashSet;
import java.util.Set;

public class  포켓몬_pro {
  public static int solution(int[] nums) {
    // given
    int answer = 0;
    Set<Integer> set = new HashSet<>();

    // when
    for (int n : nums){
      set.add(n);
    }

    // then
    int setSize = set.size();
    int numsHalfSize = nums.length/2;

    if (setSize < numsHalfSize)
      return setSize;

    return numsHalfSize;
  }

  public static void main(String[] args) {
    int[] nums = {3,3,3,2,2,2};
    System.out.println(solution(nums));
  }

}
