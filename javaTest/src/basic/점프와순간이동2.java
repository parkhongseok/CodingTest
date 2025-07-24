package basic;

public class 점프와순간이동2 {
  public static int solution(int n) {
    int answer = 0;
    // when
    while(n > 0){
      if (n%2 == 0){
        n = n/2;
      }else{
        n = (n-1)/2;
        answer++;
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    System.out.println(solution(5000));
  }
}
