package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class 주유소_13305 {
  static String test = """
4
3 3 4
2 2 1 4
""";

  static void print(int[] L){

    for (int l : L){
      System.out.print(l + " ");
    }

    System.out.println();
  }

  static long sum(int[] edges, int[] nodes, int now, int target){
    long distance = 0;

    for (int i = now; i < target; i++){
      distance += edges[i];
    }

    return distance*nodes[now];
  }
  public static void main(String[] args) throws NumberFormatException, IOException {
    // given
    StringReader sr = new StringReader(test);
    // InputStreamReader sr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(sr);
    StringTokenizer st;

    int N = Integer.parseInt(br.readLine());
    int[] edges = new int[N-1];
    int[] nodes = new int[N];
    
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N-1; i++){
      edges[i] = Integer.parseInt(st.nextToken());
    }
    
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++){
      nodes[i] = Integer.parseInt(st.nextToken());
    }

    // when
    long answer = 0;
    int now = 0;
    while (now < N){
      Integer target = null;
      for (int j = now; j < N; j++){
        if (nodes[now] > nodes[j]){
          target = j;
          break;
        }
      }
      if (target == null){
        answer += sum(edges, nodes, now, N-1);
        break;
      }
      answer += sum(edges, nodes, now, target);
      now = target;
    }

    // then
    System.out.println(answer);
  }
}
