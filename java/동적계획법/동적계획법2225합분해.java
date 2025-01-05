
import java.util.Scanner;


class 동적계획법2225합분해 {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int K = sc.nextInt();
      sc.close();
      
      // 입력
      // int N = 6;
      // int K = 4;
      int BIG = (int)Math.pow(10, 9);

      int[][] dp = new int[K+1][N+1];
      
      // 초기 조건
      for (int j = 0; j < N+1; j++) {
          dp[0][j] = j;
          dp[1][j] = 1;
      }
      for (int i = 0; i < K+1; i++){
        dp[i][0] = 1;
      }

      // dp 점화식 계산
      for (int i = 2; i < K+1; i++) {
        for (int j = 1; j < N+1; j++){
          dp[i][j] = (dp[i-1][j] + dp[i][j-1])%BIG;
        }
      }

      // print
      // for (int i = 0; i < K+1; i++) {
      //   System.out.println(Arrays.toString(dp[i]));
      // }

      // answer
      System.out.print(dp[K][N]);
    }
}