package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 파일합치기 {
  static String test = """
2
4
40 30 30 50
15
1 21 3 4 5 35 5 4 3 5 98 21 14 17 32
""";
  
  static int solve(int K, List<Integer> pages){
    int answer = 0;
    List<Integer> dp = new ArrayList<>();
    // given
    dp.add(0);
    dp.add(pages.get(0)+pages.get(1));
    dp.add(dp.get(1)+pages.get(2));

    // when
    for (int i = 3; i < K; i++){
      int tempMin = Math.min(dp.get(i-2) + pages.get(i-1) + pages.get(i), dp.get(i-1) + pages.get(i));
      dp.add(tempMin); 
    }
    System.err.println("pages" + pages);
    System.err.println("dp" + dp);
    return dp.get(K-1);
  }


  public static void main(String[] args) throws NumberFormatException, IOException {
    StringReader sr = new StringReader(test);
    // InputStreamReader sr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(sr);

    int T = Integer.parseInt(br.readLine());
    List<Integer> pages;
    for (int i = 0; i < T; i++){
      int K = Integer.parseInt(br.readLine());
      pages = new ArrayList<>();
      
      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int j = 0; j < K; j++){
        pages.add(Integer.parseInt(st.nextToken()));
      }
      System.out.println(solve(K, pages));
    }
    
  }
}
