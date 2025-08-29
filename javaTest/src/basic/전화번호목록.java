package basic;

import java.util.Arrays;

public class 전화번호목록 {
  public boolean solution(String[] phone_book) {
    // 1. 사전순 정렬
    Arrays.sort(phone_book);

    // 2. 두개씩 비교
    for (int i = 0; i < phone_book.length -1; i++){
      if (phone_book[i+1].startsWith(phone_book[i])){
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args) {
    String[] pb = {"123","456","789"};
    전화번호목록 P = new 전화번호목록();
    System.out.println(P.solution(pb));
  }
  
}
