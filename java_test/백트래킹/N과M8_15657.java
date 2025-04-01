
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class N과M8_15657 {
    static StringBuilder sb = new StringBuilder();
//     static String test = """
// 4 2
// 9 8 7 1
// """;
    static void back(int N, int M, List<Integer> NumList, int before, List<Integer> answer){
      if (answer.size() == M){
        for (int n : answer){
          sb.append(n).append(' ');
        }
        sb.append('\n');
        return;
      }
      for (int n : NumList){
        if (n >= before){
          answer.add(n);
          back(n, M, NumList, n, answer);
          answer.remove(answer.size()-1);
        }
      }
    }

    public static void main(String[] args) throws IOException{
      // 표준 입력 처리
      // StringReader sr = new StringReader(test);
      InputStreamReader sr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(sr);

      String[] NM = br.readLine().split(" ");
      int N = Integer.parseInt(NM[0]);
      int M = Integer.parseInt(NM[1]);
      ArrayList<Integer> NumList = Arrays.stream(br.readLine().split(" "))
                                        .map(Integer::parseInt)
                                        .collect(Collectors.toCollection(ArrayList::new));
      br.close();
      Collections.sort(NumList);
      
      back(N, M, NumList, 0, new ArrayList<>());
      System.out.println(sb);
    }
}