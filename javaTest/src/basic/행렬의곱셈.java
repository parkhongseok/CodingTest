package basic;

public class 행렬의곱셈 {
  public static int[][] solution(int[][] arr1, int[][] arr2) {
    int n = arr1.length; 
    int m = arr2[0].length;
    int l = arr2.length;

    int[][] arr3 = new int[n][m];

    for (int j = 0; j < m; j++){
      for (int i = 0; i < n; i++){
        for (int k = 0; k < l; k++){
          arr3[i][j] += arr1[i][k] * arr2[k][j];
        }
      }
    }

    return arr3;
  }

  public static void main(String[] args) {
    int[][] arr1 = {{2, 3, 2}, {4, 2, 4}, {3, 1, 4}};
    int[][] arr2 = {{5, 4, 3}, {2, 4, 1}, {3, 1, 1}};


    int[][] answer = solution(arr1, arr2);

    for (int[] line : answer){
      for (int item : line){
        System.out.print(item + " ");
      }
      System.out.println();
    }
    
  }

}
