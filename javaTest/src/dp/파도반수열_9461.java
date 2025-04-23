package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class 파도반수열_9461 {
  static int T, N;
  static List<Long> white = new ArrayList<>(List.of(1L, 2L));
  static List<Long> blue = new ArrayList<>(List.of(1L, 1L, 2L));
  static StringBuilder sb = new StringBuilder();
  static String test = """
2
6
13
""";

  public static void main(String[] args) throws IOException
  {
    // given
    StringReader sr = new StringReader(test);
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(sr);
    T = Integer.parseInt(br.readLine());

    // when
    for (int i = 2; i < 50; i++){
      white.add(blue.get(i-2) + blue.get(i));
      blue.add(white.get(i-2) + white.get(i));
    }

    // then
    for (int i = 0; i < T; i++){
      N = Integer.parseInt(br.readLine());
      if (i != 0){
        sb.append('\n');
      }
      sb.append((N % 2 == 1) ? blue.get(N/2) : white.get(N/2 - 1));
    }

    System.out.println(sb);
  }
}
