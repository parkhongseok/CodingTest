package basic;

public class 배열자르기 {
    public static int[] solution(int n, long left, long right) {
        int size = (int)(right - left + 1);
        int[] answer = new int[size];

        for (int i = 0; i < size; i++){
            long x = left + i;
            answer[i] = (int)Math.max(x/n, x%n) + 1;
        }

        return answer;
    }


}