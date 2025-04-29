package binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class 공유기설치_bitArray_2110 {
  static long n, targetC;
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

static void printBitArray(boolean[] B){
  for (int i = 0; i < B.length; i++) {
    System.out.print(i + ":" + (B[i] ? "[#] " : "[ ] "));
    if (i == B.length -1)
      System.out.println();
  }
}

public static void main(String[] args) throws IOException {
  StringReader sr = new StringReader(test);
  // InputStreamReader sr = new InputStreamReader(System.in);
  BufferedReader br = new BufferedReader(sr);
  StringTokenizer st = new StringTokenizer(br.readLine());
  n = Long.parseLong(st.nextToken());
  targetC = Long.parseLong(st.nextToken());

  List<Integer> A = new ArrayList<>();
  for (int i = 0 ; i < n; i++){
    A.add(Integer.parseInt(br.readLine()));
  }
  int minA = Collections.min(A);
  int maxA = Collections.max(A);

  B = new boolean[maxA+1];
  for (int idx : A){
    B[idx] = true;
  }

  // printBitArray(B);
  start = minA;
  last = maxA;
  while (start <= last) {
    mid = start + (last - start)/2;
    // System.out.println("mid : " + mid);
    // 주어진 간격 내, 개수 cnt 얻기
    cnt = 1;
    int idx = (int)(minA + mid);
    while (idx <= maxA){
      if (B[idx] == true){
        cnt += 1;
        // System.out.println("  => cnt : " + cnt + ", idx : " + idx);
        idx += mid;
      }
      else {
        idx ++;
      }
    }

    if (cnt >= targetC){
      answer = mid;
      start = mid + 1;
    }else{
      last = mid - 1;
    }
  }

  System.err.println(answer);
}
}
//  메모리 초과 