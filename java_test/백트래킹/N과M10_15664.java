import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class N과M10_15664 {
  static String test = """
4 2
9 7 9 1
""";
// sysout.print는 정말 느리기 때문에 이 결과를 모아서 한 번에 출력
static StringBuilder sb = new StringBuilder();
static List<List<Integer>> combs = new ArrayList<>();




  public static void combine(int N, int M, List<Integer> comb, int start){
    if (comb.size() == M){
      combs.add(new ArrayList<>(comb));
      return;
    }

    for (int i = start; i < N; i++){
      comb.add(i);
      combine(N, M, comb, i+1);
      comb.remove(comb.size()-1);
    }
  }

  public static void main(String[] args) throws IOException{
    combine(5, 3, new ArrayList<>(), 0);
    Set<List<Integer>> results = new TreeSet<>();

    StringReader sr = new StringReader(test);
    // InputStreamReader sr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(sr);

    String[] NM = br.readLine().split(" ");
    int N = Integer.parseInt(NM[0]);
    int M = Integer.parseInt(NM[1]);
    String[] strNumbers = br.readLine().split(" ");
    List<Integer> nums = new ArrayList<>();
    for (String strN : strNumbers){
      nums.add(Integer.parseInt(strN));
    }

    br.close();
    Collections.sort(nums);

    for (List<Integer> comb : combs){
      for (int i : comb){
        comb.add(nums.get(i));
      }
      results.add(comb);
    }

    for (List<Integer> res : results){
      System.err.println(res);

    }
  }
  
}