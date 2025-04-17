package recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 병합정렬1_24060 {
  static int N, K, mergeCount;
  static int kthValue = -1;

  static void merge(List<Integer> A, int first, int pivot, int last){
    List<Integer> B = new ArrayList<>();
    int i = first;
    int j = pivot + 1;
    while (i <= pivot && j <= last){
      if (A.get(i) <= A.get(j))
        B.add(A.get(i++));
      else
        B.add(A.get(j++));
    }
    while (i <= pivot)
      B.add(A.get(i++));
    while (j <= last)
      B.add(A.get(j++));

    i = first;
    int t = 0;
    while (i <= last){
      A.set(i,  B.get(t));
      mergeCount++;
      if (mergeCount == K)
        kthValue = A.get(i);
      i++;
      t++;
    }
  }

  static void mergeSort(List<Integer> A, int first, int last){
    if (first < last){
    int pivot = (int)((first + last)/2);
    mergeSort(A, first, pivot);
    mergeSort(A, pivot+1, last);
    merge(A, first, pivot, last);
  }
  }

  public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    String input = "5 14\n4 5 1 3 2\n";
    Scanner sc = new Scanner(new java.io.ByteArrayInputStream(input.getBytes()));


    N = sc.nextInt();
    K = sc.nextInt();
    List<Integer> A = new ArrayList<>();
    for (int i = 0; i < N; i++)
      A.add(sc.nextInt());
    sc.close();
    mergeSort(A, 0, N - 1);

    System.out.println(kthValue);
  }
}
