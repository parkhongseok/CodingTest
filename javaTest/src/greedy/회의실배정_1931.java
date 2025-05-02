package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 회의실배정_1931 {
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

static class Meeting implements Comparable<Meeting> {
        int start, end;
        public Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }
        @Override
        public int compareTo(Meeting other) {
            if (this.end != other.end) return this.end - other.end;
            return this.start - other.start;
        }
    }

    public static void main(String[] args) throws IOException {
      StringReader sr = new StringReader(test);
      // InputStreamReader sr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(sr);
      int n = Integer.parseInt(br.readLine());
      Meeting[] meetings = new Meeting[n];
      StringTokenizer st;
      for (int i = 0; i < n; i++) {
          st = new StringTokenizer(br.readLine());
          int s = Integer.parseInt(st.nextToken());
          int e = Integer.parseInt(st.nextToken());
          meetings[i] = new Meeting(s, e);
      }

      Arrays.sort(meetings);

      int count = 0, lastEnd = 0;
      for (Meeting m : meetings) {
          if (m.start >= lastEnd) {
              count++;
              lastEnd = m.end;
          }
      }

      System.out.println(count);
  }
}
