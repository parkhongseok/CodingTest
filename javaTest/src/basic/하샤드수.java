package basic;

public class 하샤드수 {
  public boolean solution(int x) {
    int y = 0;

    for (char c : (x+"").toCharArray()){
      y += c-'0';
    }

    return x%y == 0;
  }

  public static void main(String[] args) {
    하샤드수 s = new 하샤드수();
    System.out.println(s.solution(12));
  }
}
