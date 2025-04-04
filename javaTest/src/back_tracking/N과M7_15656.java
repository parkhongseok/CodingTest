package back_tracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class N과M7_15656 {
    static StringBuilder sb = new StringBuilder();
//     static String test = """
// 3 3
// 1231 1232 1233
// """;

    static void back(int N, int M, List<Integer> Ns, List<Integer> answer){
      if (answer.size() == M){
        for (int n : answer){
          sb.append(n).append(' ');
        }
        sb.append('\n');
        return;
      }

      for (int n : Ns){
        answer.add(n);
        back(N, M, Ns, answer);
        answer.remove(answer.size()-1);
      }
    }

    public static void main(String[] args) throws IOException{
      // StringReader sr = new StringReader(test);
      InputStreamReader sr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(sr);

      String[] NM = br.readLine().split(" ");
      int N = Integer.parseInt(NM[0]);
      int M = Integer.parseInt(NM[1]);
      ArrayList<Integer> Ns = Arrays.stream(br.readLine().split(" "))
                                          .map(Integer::parseInt)
                                          .collect(Collectors.toCollection(ArrayList::new));
      br.close();
      Collections.sort(Ns);

      back(N, M, Ns, new ArrayList<>());
      System.out.println(sb);
    }
}