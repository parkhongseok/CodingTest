package sort;

import java.util.Arrays;

public class 가장큰수_2_pro {
  static public String solution(int[] numbers) {
    // 1. int[] → String[] 변환
    String[] nums = Arrays.stream(numbers)
                          .mapToObj(String::valueOf)
                          .toArray(String[]::new);

    // 2. 커스텀 정렬: 두 문자열을 붙였을 때 더 큰 쪽이 앞에 오도록
    Arrays.sort(nums, (a, b) -> (b + a).compareTo(a + b));

    // 3. 예외 처리: 모두 0인 경우
    if (nums[0].equals("0")) return "0";

    // 4. StringBuilder로 문자열 결합
    StringBuilder sb = new StringBuilder();
    for (String num : nums) {
        sb.append(num);
    }

    return sb.toString();
}

public static void main(String[] args) {
    int[] input = {3, 30, 34, 5, 9};
    System.out.println(solution(input)); // 9534330
}
}
