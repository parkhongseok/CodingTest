package sort;

import java.util.Arrays;

public class H_index_pro {
  static public int solution(int[] citations) {
    Integer[] L = Arrays.stream(citations).boxed().toArray(Integer[]::new);
    Arrays.sort(L);
    int n = L.length;
    int start = 0;
    int end = n;
    int H = 0;
    while (start <= end){
      int mid = (start + end)/2;
      int cnt = 0;
      for (int i = 0; i < n; i++){
        if (L[i] >= mid){
          cnt = n - i;
          break;
        }
      }
      if (cnt >= mid){
        start = mid + 1;
        H = mid;
      }else{
        end = mid - 1;
      }
    }



    return H;
  }
  public static void main(String[] args) {
    int[] citations = {3, 0, 6, 1, 5};
    System.out.println(solution(citations));
  }
}
