package basic.개인연습;


import java.util.Deque;
import java.util.LinkedList;

public class 배열회전 {
  // -> 오른쪽 회전
  public void solution1(int[] arr, int k){
    Deque<Integer> d = new LinkedList<>();
    k = k%arr.length;

    for (int x : arr){
      d.add(x);
    }
    System.out.println(d);
    System.out.println(d.pop());
    System.out.println(d);

    for (int i = 0; i < k; i++){
      d.addFirst(d.removeLast());
    }
    System.out.println(d);
  }


    // <- 왼쪽 회전 
    public void solution2(int[] arr, int k){
    Deque<Integer> d = new LinkedList<>();

    for (int x : arr){
      d.add(x);
    }
    System.out.println(d);


    for (int i = 0; i < k; i++){
      d.add(d.pop());
    }

    System.out.println(d);
  }

  public static void main(String[] args) {
    배열회전 s = new 배열회전();

    int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
    int k = 10;

    System.out.println("=== 1. ===");
    s.solution1(arr, k);

    System.out.println("=== 2. ===");
    s.solution2(arr, k);
  }
}
