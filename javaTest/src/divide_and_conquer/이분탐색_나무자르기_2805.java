package divide_and_conquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class 이분탐색_나무자르기_2805 {
  static int N, M;
  static List<Integer> T;
  static String test = """
4 7
20 15 10 17
""";

  static int f(List<Integer> T, int M, int H, int gap){
    if (gap==0){
      return H;
    }
    int sumT = 0;
    for (int tree : T){
      sumT += tree;
    }
    int getT = sumT - H*T.size();

    if (getT > M){
      return f(T, M, H+gap/2, gap/2);
    }
    else if (getT < M){
      return f(T, M, H-gap/2, gap/2);
    }
    else{
      return H;
    }
  }

  public static void main(String[] args) throws IOException {
    StringReader sr = new StringReader(test);
    // InputStreamReader sr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(sr);

    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    
    st = new StringTokenizer(br.readLine());
    T = new ArrayList<>();
    for (int i = 0; i < N; i++){
      T.add(Integer.parseInt(st.nextToken()));
    }
    Collections.sort(T);

    int h = (T.get(0) + T.get(N-1))/2;
    int gap = (T.get(0) - T.get(N-1))/2;
    int answer = f(T, M, h, gap);
    System.out.println(answer);
  }
}