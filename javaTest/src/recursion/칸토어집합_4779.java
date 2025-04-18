package recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.BitSet;

public class 칸토어집합_4779 {
  static StringBuilder sb = new StringBuilder();
  static BitSet cantorSet;
  static int n;
  static String test = """
1
2
3
""";

  static void getCantorSet(int first, int last){
    int gap = (int)((last-first)/3);

    cantorSet.clear(first+gap, first+2*gap);
    
    if (gap <= 1)
      return;
    
    getCantorSet(first + 2*gap , last);
    getCantorSet(first, first+gap);
  }

  public static void main(String[] args) {
    StringReader sr = new StringReader(test);
    // InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(sr);
    
    while (true){
      try{
        n = Integer.parseInt(br.readLine());
        int N = (int)Math.pow(3, n);
        cantorSet = new BitSet(N);
        cantorSet.set(0, N);

        getCantorSet(0, N);

        for (int i = 0; i < N; i++)
          sb.append(cantorSet.get(i) ? "-" : " ");
        
          System.out.println(sb);
          sb.setLength(0);
        }
        catch(Exception e){
          break;
        }
    }
  }
}