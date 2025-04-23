package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.lang.Math;

public class RGB거리_1149 {
  static int T, N, r, g, b;
  static List<Integer> R, G, B;
  static String test = """
8
71 39 44
32 83 55
51 37 63
89 29 100
83 58 11
65 13 15
47 25 29
60 66 19  
"""; // 253

  public static void main(String[] args) throws IOException{
    StringReader sr = new StringReader(test);
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(sr);
    StringTokenizer st = new StringTokenizer(br.readLine());

    N = Integer.parseInt(st.nextToken());

    R = new ArrayList<>();
    G = new ArrayList<>();
    B = new ArrayList<>();

    st = new StringTokenizer(br.readLine());
    R.add(Integer.parseInt(st.nextToken()));
    G.add(Integer.parseInt(st.nextToken()));
    B.add(Integer.parseInt(st.nextToken()));
    
    for (int i = 0; i < N-1; i ++){
      st = new StringTokenizer(br.readLine());
      r = Integer.parseInt(st.nextToken());
      g = Integer.parseInt(st.nextToken());
      b = Integer.parseInt(st.nextToken());
      R.add(Math.min(r + G.get(i), r + B.get(i)));
      G.add(Math.min(g + B.get(i), g + R.get(i)));
      B.add(Math.min(b + R.get(i), b + G.get(i)));
    }
    
    int last = R.size() - 1;
    int min = Math.min(R.get(last), Math.min(G.get(last), B.get(last)));
    System.out.println(min);
  }
}
