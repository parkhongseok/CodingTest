package binary_search;

import java.util.Scanner;

public class K번째수_1300 {
  static String test = """
100000
10000000
      """;

  static long countUnder(int n, long x){
    long cnt = 0;

    for (int i = 1; i < n+1; i++){
      cnt += Math.min(n, x/i);
    }
    return cnt;
  }


  public static void main(String[] args) {
    Scanner sc = new Scanner(test);
    // Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();

    long left = 0;
    long right = (long) n * n;
    long answer = 0;

    while (left <= right){
      long mid = (left + right)/2;
      long cnt = countUnder(n, mid);

      if (cnt < k){
        left = mid + 1;
      }
      else {
        answer = mid;
        right = mid - 1;
      }
    }

    System.out.println(answer);

  }
}
