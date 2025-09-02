package basic.면접;

public class 구구단출력 {
  public void solution(int n){
    StringBuilder sb = new StringBuilder();
    for (int i = 2; i < 10; i++){
      for (int j = 1; j < i+1; j++){
        sb.append(String.format("%dx%d=%d ", i, j, i*j));
      }
      sb.append("\n");
    }

    System.out.println(sb);
  }

  public static void main(String[] args){
    구구단출력 g = new 구구단출력();
    g.solution(3);
  }
}