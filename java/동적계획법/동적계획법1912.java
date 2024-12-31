import java.util.Scanner;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++){
            A[i] = scanner.nextInt();
        }

        int[] dp = A.clone();
        for (int i = 1; i < N; i++){
            int x = A[i] + dp[i-1];
            if (dp[i] < x){
                dp[i] = x;
            }
        }

    int answer = Integer.MIN_VALUE;
    for (int value : dp) {
        if (value > answer) {
            answer = value;
        }
    }
    System.out.println(answer);

    scanner.close();
    }
}