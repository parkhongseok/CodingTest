package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class ATM_11399 {
  static String test = """
5
3 1 4 3 2
""";
  

  public static void main(String[] agrs) throws NumberFormatException, IOException{
    StringReader sr = new StringReader(test);
    // InputStreamReader sr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(sr);
    int N = Integer.parseInt(br.readLine());

    StringTokenizer st = new StringTokenizer(br.readLine());
    Integer[] P = new Integer[N];
    
    for (int i = 0; i < N; i ++ ){
      P[i] = Integer.valueOf(Integer.parseInt(st.nextToken()));
    }
    
    Arrays.sort(P);
    int sum = 0;
    for (int i = 0; i < N; i++){
      sum += (N-i)*P[i];
    }
    System.out.println(sum);
  }
}
