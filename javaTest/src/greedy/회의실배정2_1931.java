package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class 회의실배정2_1931 {
  static String test = """
6
2 3
0 4
7 7
5 7
0 8
3 10
""";


  public static void main(String[] args) throws NumberFormatException, IOException {
    // given
    StringReader sr = new StringReader(test);
    // InputStreamReader sr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(sr);
    StringTokenizer st;

    int start, end;
    int N = Integer.parseInt(br.readLine());
    Map<Integer, Integer> map = new TreeMap();

    for (int i = 0; i < N; i++){
      st = new StringTokenizer(br.readLine());
      start = Integer.parseInt(st.nextToken());
      end = Integer.parseInt(st.nextToken());
      Integer prevValue = map.get(end); //Wrapper Type으로 null 가능
      if (prevValue == null || start > prevValue) {
          map.put(end, start);
      }
    }

    // when
    int cnt = 1;
    List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(map.entrySet());
    Map.Entry<Integer, Integer> now = entries.get(0);
    Map.Entry<Integer, Integer> next;
    for (int i = 1; i < entries.size(); i++) {
      next = entries.get(i);
      if (now.getKey() <= next.getValue()){
        cnt++;
        now = next;
      }
      System.out.println(" * " + now.getKey() + " " + now.getValue() + " - " + next.getKey() + " " + next.getValue());
    }

    // then
    System.out.println(cnt);
  }
}
