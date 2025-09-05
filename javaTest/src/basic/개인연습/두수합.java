package basic.개인연습;


import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class 두수합 {
  
  public boolean solution(int[] arr, int k){
    for (int i = 0; i < arr.length-1; i++){
      for (int j = i+1; j < arr.length; j++){
        if (arr[i] + arr[j] == k){
          return true;
        }
      }
    }
    return false;
  }

  public boolean solution2(int[] arr, int k){
    Set<Integer> set = new HashSet<>();

    for (int x : arr){
      if (set.contains(k-x)) return true;
      set.add(x);
    }
    
    return false;
  }

  public static void main(String[] args) {
    두수합 s = new 두수합();
    int[] arr = new int[]{1, 2, 3, 9};
    int k = 8;

    System.out.println("=== 1. ===");
    System.out.println(s.solution(arr, k));
    
    System.out.println("=== 2. ===");
    System.out.println(s.solution(arr, k));
  }
}
