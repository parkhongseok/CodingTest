package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class 동전0_11047 {
  static String test = """
10 4790
1
5
10
50
100
500
1000
5000
10000
50000
""";

  public static void main(String[] args) throws IOException {
    StringReader sr = new StringReader(test);
    // InputStreamReader sr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(sr);
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());

    int[] coinList = new int[N];
    for (int i = 0; i < N; i++){
      coinList[i] = Integer.parseInt(br.readLine());
    }

    int sum = 0;
    for (int i = 0; i < N; i++){
      int coin = coinList[N-i-1];
      if (coin > K){
        continue;
      }
      sum += K/coin;
      K = K%coin;
    }
    System.out.println(sum);
  }
  
}