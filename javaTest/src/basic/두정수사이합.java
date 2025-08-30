package basic;

public class 두정수사이합 {
  public long solution(int a, int b) {
    return (long)(Math.abs(a-b)+1)*(long)(a+b)/2;
  }

  public static void main(String[] args) {
    두정수사이합 d = new 두정수사이합();
    long anwser = d.solution(-10000000, -5);
    System.out.println(anwser);
  }
}
