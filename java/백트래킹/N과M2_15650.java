
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class N과M2_15650 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.close();
        fx(N, M, 1, new ArrayList<>());
    }

    public static void fx(int N, int M, int start, List<Integer> answer){
        if (answer.size() == M){
            for (int item : answer){
                System.out.print(item + " ");
            }
            System.out.println();
            return;
        }
        for (int i = start; i <= N; i++){
            answer.add(i);
            fx(N, M, i + 1, answer);
            answer.remove(answer.size()-1);
        }
    }
}