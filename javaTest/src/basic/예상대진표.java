package basic;

public class 예상대진표 {
    public static int vs(int a, int b, int cnt){
      if (a == b){return cnt;}
      return vs((a+1)/2, (b+1)/2, cnt+1);
    }

    public static int solution(int n, int a, int b){
      return vs(a, b, 0);
    }

  public static void main(String[] args) {
    System.out.println(solution(8, 4, 7));
  }
}
