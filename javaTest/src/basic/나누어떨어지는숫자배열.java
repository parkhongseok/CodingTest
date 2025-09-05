package basic;

import java.util.Arrays;


public class 나누어떨어지는숫자배열 {
  public int[]  solution(int[] arr, int divisor){
    int[] answer = new int[arr.length];
    int idx = 0;
    for(int x : arr){
      if (x%divisor == 0) answer[idx++] = x;
    }
    if (idx == 0) return new int[]{-1};

    Arrays.sort(answer, 0, idx);
    return Arrays.copyOf(answer, idx);
  }

  public static void main(String[] args) {
  나누어떨어지는숫자배열 s = new 나누어떨어지는숫자배열();
  int[] arr = {5, 9, 7, 10};
  int d = 5;
  for (int x : s.solution(arr, d)){
    System.out.print(x + " ");
  }
  }
}