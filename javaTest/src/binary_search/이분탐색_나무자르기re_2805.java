package binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class 이분탐색_나무자르기re_2805 {
  static long a, b, answer, mid, getT, N, M;
  static List<Long> T;
  static String test = """
6 3
5 5 0 5 2 3
""";



  public static void main(String[] args) throws IOException {
    StringReader sr = new StringReader(test);
    // InputStreamReader sr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(sr);

    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Long.parseLong(st.nextToken());
    M = Long.parseLong(st.nextToken());
    
    st = new StringTokenizer(br.readLine());
    T = new ArrayList<>();
    for (int i = 0; i < N; i++){
      T.add(Long.parseLong(st.nextToken()));
    }
    Collections.sort(T);

    a = 0;
    b = T.get(T.size()-1);
    while (a <= b){
      mid = a + (b - a) / 2;
      getT = 0;
      for (long tree : T){
        if (tree > mid){
          getT += tree - mid;
        }
      }

    System.out.printf("a: %d, b: %d, mid: %d, getT: %d, answer: %d\n", a, b, mid, getT, answer);
      
      if (getT >= M){
        answer = mid;
        a = mid + 1;
      }
      else{
        b = mid - 1;
      }
    }

    System.out.println(answer);
  }
}