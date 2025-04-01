import java.util.Scanner;

class 동적계획법1699제곱합 {
    public static void main(String args[]){

      Scanner sc = new Scanner("11");
      int N = sc.nextInt();
      sc.close();
      // int N = 11;
      int[] dp = new int[N+1];
      for (int i = 0; i < N+1; i++){
        dp[i] = i;
      }

    for (int i = 1; i < (int)(Math.sqrt(N))+1; i++){
      dp[i*i] = 1;
    }
    
    for (int i = 1; i < N+1; i++){
      for (int j = 1; j < (int)(Math.sqrt(i)) + 1; j++){
        dp[i] = Math.min(dp[i], dp[i - j*j] + dp[j*j]);
      }
    }
    // System.out.println(Arrays.toString(dp));
    System.out.print(dp[N]);
    }
}