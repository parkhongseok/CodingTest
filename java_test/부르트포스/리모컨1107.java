

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class 리모컨1107 {
//   static String test = """
// 5457
// 3
// 6 7 8
// """;

  public static void main(String args[]) throws IOException{
    // StringReader sr = new StringReader(test);
    InputStreamReader sr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(sr);
    
    int channer = Integer.parseInt(br.readLine());
    int brocken_btn_size = Integer.parseInt(br.readLine());
    List<Character> brocken_btn_list = new ArrayList<>();
    String brocken_btn_line = br.readLine();
    if (brocken_btn_line != null){
      for (String s : brocken_btn_line.split(" ")) {
        brocken_btn_list.add(s.charAt(0));  // 첫 번째 문자 추가
      }

    }
    // 문자열을 공백으로 나눈 후 Character 리스트로 변환
  


    int min_count = Math.abs(channer-100);
    int upper = (int)Math.pow(10, String.valueOf(channer).length()) + 2*channer + 1;
    for (int N = 0; N < upper; N++){
      String strN = String.valueOf(N);
      Boolean is_btn = true;
      int lenStrN = strN.length();
      for (int i = 0; i < lenStrN; i++){
        if ( brocken_btn_list != null && brocken_btn_list.contains(strN.charAt(i))){
          is_btn = false;
          break;
        }
      }
      if (is_btn){
        int value =  strN.length() + Math.abs(channer - N);
        min_count = Math.min(min_count, value);
      }
    }
    System.out.println(min_count);
  }
}