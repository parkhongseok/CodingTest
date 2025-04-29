package binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class 공유기설치_re_2110 {
  static int n, targetC;
  static boolean[] B;
  static long start, last, cnt, mid, answer;
  static String test = """
5 3
1
2
8
4
9
""";


public static void main(String[] args) throws IOException {
  StringReader sr = new StringReader(test);
  // InputStreamReader sr = new InputStreamReader(System.in);
  BufferedReader br = new BufferedReader(sr);
  StringTokenizer st = new StringTokenizer(br.readLine());
  n = Integer.parseInt(st.nextToken());
  targetC = Integer.parseInt(st.nextToken());

  List<Long> A = new ArrayList<>();
  for (int i = 0 ; i < n; i++){
    A.add(Long.parseLong(br.readLine()));
  }
  Collections.sort(A);

  start = 1;
  last = A.get(A.size()-1) - A.get(0);
  while (start <= last) {
    mid = start + (last - start)/2;

    cnt = 1;
    long lastVisited = A.get(0);
    for (int i = 1; i < A.size(); i++) {
        if (A.get(i) - lastVisited >= mid) {
            cnt++;
            lastVisited = A.get(i);
        }
    }

    if (cnt >= targetC){
      answer = mid;
      start = mid + 1;
    }else{
      last = mid - 1;
    }
  }
  System.out.println(answer);
  }
}
