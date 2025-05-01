package sort;

public class k번째수_programers {
  static int[] array = {1, 5, 2, 6, 3, 7, 4};
  static int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
  static int[] answer;


  static void printList(int[] L){
    for (int l : L){
      System.out.print(l+" ");
    }
    System.out.println();
  }
  
  static void sort(int[] L){
    for (int i = 0; i < L.length; i++){
      int max = 0;
      int maxIdx = -1;
      for (int j = 0; j < L.length - i; j++){
        if (L[j] > max){
          max = L[j];
          maxIdx  = j;
        }
      }
      L[maxIdx] = L[L.length - i - 1];
      L[L.length - i - 1] = max;
    }
  }

  static int[] solution(int[] array, int[][] commands){
    int[] answer = new int[commands.length];
    
    for (int i = 0; i < commands.length; i++){
      int[] line = commands[i];
      int[] temp = new int[line[1] - line[0] + 1];
      for (int j = 0; j < (line[1] - line[0] + 1); j++){
        temp[j] = array[line[0] + j - 1];
      }
      sort(temp);
      answer[i] = temp[line[2]-1];
    }
    return answer;
  }

  public static void main(String[] args) {
    answer = solution(array, commands);
    printList(answer);


  }
}
