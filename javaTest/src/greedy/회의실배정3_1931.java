package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 회의실배정3_1931 {
  static String test = """
11
1 4
3 5
0 6
5 7
3 8
5 9
6 10
8 11
8 12
2 13
12 14
""";

  static class Meeting{
    int start, end;
    Meeting(int s, int e){
      this.start = s;
      this.end = e;
    }
  }


  public static void main(String[] args) throws NumberFormatException, IOException {
  // given
    StringReader sr = new StringReader(test);
    // InputStreamReader sr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(sr);
    StringTokenizer st;
    // init
    int start, end;
    int N = Integer.parseInt(br.readLine());
    List<Meeting> meetings = new ArrayList<>();
    for (int i = 0; i < N; i++){
      st = new StringTokenizer(br.readLine());
      start = Integer.parseInt(st.nextToken());
      end = Integer.parseInt(st.nextToken());
      meetings.add(new Meeting(start, end));
    }

    // for (Meeting m : meetings){
    //   System.out.println(m.start + " - " + m.end);
    // }

    // sorting 
    meetings.sort((a, b)->{
      if (a.end == b.end) return a.start - b.start;
      return a.end - b.end;
    });

    // when
    int cnt = 0;
    int lastEnd = 0;
    for (Meeting now : meetings) {
      if (now.start >= lastEnd){
        cnt++;
        lastEnd = now.end;
        // System.out.println(" * " + now.end + " " + now.start);
      }
    }

    // then
    System.out.println(cnt);
  }
}
