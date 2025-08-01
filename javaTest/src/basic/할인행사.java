package basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class 할인행사 {
  public static int solution(String[] want, int[] number, String[] discount) {
    int answer = 0;

    for (int i = 0; i < discount.length - 9; i++){
      int[] cart = new int[want.length];
      // for each day
      for (int j = i; j < i + 10; j++){
        // if contain 
        for (int k = 0; k < want.length; k++){
          if (discount[j].equals(want[k])) {
            cart[k] += 1;
            break;
          }
        }
      }

      for (int l = 0; l < want.length; l++){
        if (cart[l] == 0 || number[l] < cart[l]) {break;}
        if (l == want.length-1){++answer;}
      }
      }

      return answer;
    }




  public static void main(String[] args) {
    String[] want = {"banana", "apple", "rice", "pork", "pot"};
    int[] number = {3, 2, 2, 2, 1};
    String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};

    int x = solution(want, number, discount);
    System.out.println(x);
  }


}
