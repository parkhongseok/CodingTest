package sort;

public class 가장큰수_pro {
  static int[] input = {3, 30, 34, 5, 9};
  static String answer;


  static void printList(int[] L){
    for (int l:L){
      System.out.print(l + " ");
    }
    System.out.println();
  }

  static boolean shouldBeChange(int a, int b){
    String case1 = ""+a+b;
    String case2 = ""+b+a;
    if (Integer.parseInt(case1) >= Integer.parseInt(case2)){
      return false;
    }
    return true;
  }

  static void sortStringDesc(int[] L){
    for (int i = 0; i < L.length; i++){
      for (int j = 0; j < L.length - 1; j++){
        if (!shouldBeChange(L[j], L[j+1])){
          continue;
        }
        int temp = L[j+1];
        L[j+1] = L[j];
        L[j] = temp;
      }
    }
    printList(L);
}

  static public String solution(int[] numbers) {
    String answer = "";
    sortStringDesc(numbers);
    for (int n : numbers){
      answer += n;
    }
    return answer;
}

public static void main(String[] args) {
  System.out.println(solution(input));
}
}
