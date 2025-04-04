package back_tracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class N과M5_15654 {
//     static String test = """
// 4 4
// 1231 1232 1233 1234
//     """;

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException, NumberFormatException{

      // 표준입력 처리
      // StringReader sr = new StringReader(test);
      InputStreamReader sr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(sr);

      // 전처리
      String[] NM = br.readLine().split(" ");
      // int N = Integer.parseInt(NM[0]);
      int M = Integer.parseInt(NM[1]);
      ArrayList<Integer> Numbers = new ArrayList<>();
      for (String n : br.readLine().split(" ")){
        Numbers.add(Integer.parseInt(n));
      }
      Collections.sort(Numbers);
      br.close();

      // 함수 호출 및 출력
      back(Numbers, M, new ArrayList<>());
      System.out.println(sb);
    }

    public static void back(List<Integer> Numbers, int M, List<Integer> answer){
      if (answer.size() == M){
        for (int item : answer){
          sb.append(item).append(' ');
        }
        sb.append('\n');
        return;
      }
      for (int n : Numbers){
        if (!answer.contains(n)){
          answer.add(n);
          back(Numbers, M, answer);
          answer.remove(answer.size()-1);
        }
      }
    }
}