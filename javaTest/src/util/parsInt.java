package util;

public class parsInt {
  static int parseInt(String str){
    int output = 0;
    for (int i = 0; i < str.length(); i++){
      char c = str.charAt(i);
      if (((int)c < (int)'0') || ((int)c > (int)'9')){
        throw new NumberFormatException("잘못된 입력: " + str);
      }
      output += ((int)c - (int)'0')*(Math.pow(10, str.length() - i - 1));
    }
    return output;
  }
}
