package divide_and_conquer;

public class 입국심사_프로그래머스 {

  static long f(int[] T, int n, long k, int i){
    if (i == T.length -1){
      return T[i]*k/2;
    }
    long up = T[i]*(k+k/2) + f(T, n, k-k/2, i+1);
    long down = T[i]*(k-k/2) + f(T, n, k+k/2, i+1);
    // 근데 이러면 전부 다 호출하니까, 비효율적인듯?
    // 만약 T[i]*k와 나머지 중의 max를 비교해서 왼쪽이 크면 down호출, 오른쪽이 크면 up 호출 이런식으로 해볼까
    return Math.min(up, down);
  }

  static long solution(int n, int[] times) {
    int k = n - times.length;
    long answer = f(times, n, k, 0);
    return answer;
  }

  public static void main(String[] args){
    int n = 6;
    int[] times = {7, 10};
    System.out.println(solution(n, times));
  }
  
}
