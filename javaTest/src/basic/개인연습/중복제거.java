package basic.개인연습;


import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
문제 1. 정수 배열의 중복 원소 제거

문제 설명
주어진 정수 배열에서 중복된 원소를 제거하고, 남은 원소들을 출력하는 프로그램을 작성하시오.
단, 출력되는 순서는 입력 배열에서의 등장 순서를 따른다.
입력 예시 : arr = [4, 2, 5, 2, 3, 4, 1, 5]
출력 예시 : [4, 2, 5, 3, 1]

문제 2. 정수 배열의 중복 원소 제거 후 오름차순 정렬

문제 설명
주어진 정수 배열에서 중복된 원소를 제거하고, 남은 원소들을 오름차순으로 정렬하여 출력하는 프로그램을 작성하시오.
출력 예시 
[1, 2, 3, 4, 5]
 */
public class 중복제거 {
  public void solution(int[] arr){
    Set<Integer> set = new LinkedHashSet<>();

    for (int x : arr){
      set.add(x);
    }

    System.out.println(set);
  }



  public void solution2(int[] arr){
    Set<Integer> set = new TreeSet<>(Comparator.reverseOrder());

    for (int x : arr){
      set.add(x);
    }
    System.out.println(set);
  }

  public static void main(String[] args) {
    중복제거 s = new 중복제거();
    int[] arr = new int[]{4, 2, 5, 2, 3, 4, 1, 5};

    System.out.println("=== 1. 뒤집고 비교하기 ===");
    s.solution(arr);
    
    System.out.println("=== 2. 양 끝 비교하기 ===");
    s.solution2(arr);
  }
}
