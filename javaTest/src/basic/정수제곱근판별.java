package basic;

public class 정수제곱근판별 {
  public long solution(long n) {
    double x = Math.sqrt(n);
    return x % 1 == 0 ? (long)Math.pow( x + 1, 2) : -1;
  }

  public static void main(String[] args) {
    정수제곱근판별 s = new 정수제곱근판별();
    long l = s.solution(144);
    System.out.println(l);
  }
}