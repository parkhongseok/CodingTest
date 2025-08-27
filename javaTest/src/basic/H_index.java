package basic;

import java.util.Arrays;

public class H_index {
  public static int solution(int[] citations) {
    int len = citations.length;
    Arrays.sort(citations);
    int H = len;
    for (int i = 0; i < len; i++){
    H = len - i;

      if (citations[i] >= H){
        H = citations[i];
        break;
      }
    }
    return H;
  }

  public static void main(String[] args) {
    int[] citations = {0, 3, 6, 1, 5};
    int n = solution(citations);
    System.out.println(n);
  }
}
