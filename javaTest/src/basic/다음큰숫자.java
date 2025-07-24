package basic;

public class 다음큰숫자 {



public static int countOnes(int m) {
        String binary = Integer.toBinaryString(m);
        int ones = 0;
        for (int i = 0; i < binary.length(); i++){
          char x = binary.charAt(i);
          if (x == '1'){
            ones++;
          }
        }
        return ones;
}

  public static int solution(int n) {
    int answer = 0;
    int ones = countOnes(n);

    for (int i = n + 1 ; i < 2*n; i++){
      if (ones == countOnes(i)){
        answer = i;
        break;
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    System.out.println(solution(15));
  }
}
