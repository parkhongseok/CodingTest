package basic.면접;

public class 문자열뒤집기 {
  public String twoPointer(String str){
    char[] charList = str.toCharArray();
    int left = 0; int right = charList.length - 1;
    while (left < right){
      char temp = charList[left];
      charList[left] = charList[right];
      charList[right] = temp;

      left++; right--;
    }
    return new String(charList);
  }

  // 이모지 코드포인트는 기본 + 변형선택지 형식인 경우가 많은데, 그냥 뒤집으면 변형 선택지가 엉뚱한 곳에 붙을 수 있음
  // 불완전한 방식 -> 그래핀 클러스터 단위로 문자열에 접근해야함. 
  // cf -> 유니코드문자열뒤집기.java
  public String reverseUnicode(String s) {
    int[] codePoints = s.codePoints().toArray(); // 문자열을 코드포인트 배열로
    StringBuilder sb = new StringBuilder();

    for (int i = codePoints.length - 1; i >= 0; i--) {
        sb.appendCodePoint(codePoints[i]); // 코드포인트 단위로 append
    }

    return sb.toString();
}


  public static void main(String[] args) {
    문자열뒤집기 s = new 문자열뒤집기();
    System.out.println("=== 1. Two Pointer ===");
    System.out.println(s.twoPointer("apple"));

    System.out.println("=== 2. Reverse Read ===");
    System.out.println(s.reverseUnicode("appl🛠️e"));

    // cf ) 특수문자는 인덱스로 접근이 어렵다. 2칸+공백?!
    System.out.println("======");
    String x = "👍x";
    System.out.println(x.length());
    System.out.println(x.charAt(0));

    System.out.println("======");
    String y = "s👍3🛠️a";
    for (int n : y.codePoints().toArray()){
      System.out.println(Character.toChars(n));
    }
  }
}
