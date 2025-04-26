package selection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// n개 중에 k번째로 작은 수 찾기
// 입력 : int[n] Nums, int k (1부터 n까지의 수가 무작위로 배열)
// 출력 : k번째의 수
// 조건 : 최소한의 비교 
public class QuickSelect {

  static List<Integer> Nums = new ArrayList<>();
  static List<Integer> A, B, M;

  static int k, p;
  static String test = """
6 5 1 7 9 3 8 10 2
8
""";

  static int quick_select(List<Integer> L, int k){
    p = L.get(0);
    A = new ArrayList<>();
    B = new ArrayList<>();
    M = new ArrayList<>();

    for (int x: L){
      if (x < p){
        A.add(x);
      }
      else if (x > p) {
        B.add(x);
      }else {
        M.add(x);
      }
    }
    
    if (A.size() > k ){
      return quick_select(A, k);
    }else if (A.size() + M.size() < k){
      return quick_select(B, k - A.size() - M.size());
    }else{
      return p;
    }
  }

  public static void main(String[] args) throws IOException {
    StringReader sb = new StringReader(test);
    BufferedReader br = new BufferedReader(sb);
    StringTokenizer st = new StringTokenizer(br.readLine());


    try {
      while (true){
        Nums.add(Integer.parseInt(st.nextToken()));
      } 
    }
    catch ( Exception e){
    }

    k = Integer.parseInt(br.readLine());

    
    System.out.println(quick_select(Nums, k));
    
  }
}
