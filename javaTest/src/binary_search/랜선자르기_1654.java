package binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class 랜선자르기_1654 {
  static long k, n;
  static long a, b, answer, mid;
  static List<Long> L = new ArrayList<>();
  static String test = """
4 11
802
743
457
539
""";



  public static void main(String[] args) throws IOException {
    StringReader sr = new StringReader(test);
    // InputStreamReader sr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(sr);
    StringTokenizer st = new StringTokenizer(br.readLine());
    k = Long.parseLong(st.nextToken());
    n = Long.parseLong(st.nextToken());

    for (int i = 0; i < k; i++){
      L.add(Long.parseLong(br.readLine()));
    }

    a = answer = 1;
    b = Collections.max(L);
    while (a <= b) {
      mid = a + (b-a)/2;
      int getL = 0;
      for (long len: L){
        if (len >= mid){
          getL += len/mid;
        }
      }
      if (getL >= n){
        answer = mid;
        a = mid +1;
      }else{
        b = mid -1;
      }
    }

    System.out.println(answer);
}
}