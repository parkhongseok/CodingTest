package basic.면접;

public class 회문검사 {
  // 방법 1. 뒤집고 비교하기
  private String reverse(char[] chars){
    int l = 0; int r = chars.length-1;
    while(l < r){char temp = chars[l]; chars[l]=chars[r]; chars[r] = temp; l++; r--;}
    return new String(chars);
  }

  public boolean solution(String str){
    // cf) hashCode는 드물게 다른 문자인데 동일할 수 있으니 문자열 비교는 꼭, equals로 하기
    return str.equals(reverse(str.toCharArray()));
  }

  // 방법 2. 메모리 절약하기
  public boolean solution2(String str){
    if (str == null) return false;
    int l = 0, r = str.length() - 1;
    while (l < r){
      if (str.charAt(l) != str.charAt(r)) return false;
      l++; r--;
    }
    return true;
  }

  public static void main(String[] args) {
    회문검사 s = new 회문검사();
    String str = "avavavaa";
    System.out.println("=== 1. 뒤집고 비교하기 ===");
    System.out.println(s.solution(str));
    System.out.println("=== 2. 양 끝 비교하기 ===");
    System.out.println(s.solution2(str));
  }
}
