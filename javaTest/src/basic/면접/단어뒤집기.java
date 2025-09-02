package basic.면접;

public class 단어뒤집기 {

  public String solution(String str){
    String[] strArr = str.split("\\s+");
    StringBuilder sb = new StringBuilder(str.length());

    for (int i = 0; i< strArr.length; i++){
      sb.append(reverseString(strArr[i])).append(' ');
    }

    return sb.toString().trim();
  }

  private String reverseString(String str){
    char[] charArr = str.toCharArray();
    int left = 0; int right = str.length()-1;

    while (left < right){
      char temp = charArr[left];
      charArr[left] = charArr[right];
      charArr[right] = temp;

      left++; right--;
    }
    return new String(charArr);
  }

  public static void main(String[] args) {
    단어뒤집기 d = new 단어뒤집기();
    String str = "abc 123 banana hellow";
    System.out.println(d.solution(str)+"=");
  }
}
