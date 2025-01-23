import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class N과M6_15655 {
    // static String test = """
    // 4 2
    // 9 8 7 1
    //     """;

    static StringBuilder sb = new StringBuilder();

    static void back(int N, int M, List<Integer> Numbers, int before, List<Integer> answer){
      if (answer.size() == M){
        for (int item : answer){
          sb.append(item).append(' ');
        }
        sb.append('\n');
        return;
      }
      
      for (int item : Numbers){
        if (item > before){
          answer.add(item);
          back(N, M, Numbers, item, answer);
          answer.remove(answer.size()-1);
        }
      }
    }

    public static void main(String[] args) throws IOException{
      // StringReader sr = new StringReader(test);
      InputStreamReader sr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(sr);

      String[] NM = br.readLine().split(" ");
      int N = Integer.parseInt(NM[0]);
      int M = Integer.parseInt(NM[1]);

      ArrayList<Integer> Numbers = Arrays.stream(br.readLine().split(" "))
                                          .map(Integer::parseInt)
                                          .collect(Collectors.toCollection(ArrayList::new));
      br.close();
      Collections.sort(Numbers);

      back(N, M, Numbers, 0, new ArrayList<>());
      System.out.println(sb);
    }
}