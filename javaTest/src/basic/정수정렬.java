package basic;

import java.util.Arrays;

public class 정수정렬 {
  public long solution(long n) {
    long answer = 0;

    char[] arr = (n + "").toCharArray();
    Arrays.sort(arr);

    for (int i = 0; i < arr.length; i++){
      answer += (arr[i]-'0')*Math.pow(10, i);
    }

    return answer;
  }

  public static void main(String[] args) {
    정수정렬 J = new 정수정렬();
    long n = 118372;
    long answer = J.solution(n);
    System.out.println(answer);

    "".chars().sorted().forEach(null);
  }
}