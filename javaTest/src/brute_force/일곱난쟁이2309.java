package brute_force;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class 일곱난쟁이2309 {
  // static String test = """
  //           20
  //           7
  //           23
  //           19
  //           10
  //           15
  //           25
  //           8
  //           13
  //           """;
  public static void main(String[] args) throws IOException{
    // 문자열을 스트림으로 변환 (for test)
    // StringReader sr = new StringReader(test);
    
    // 프로세스 메모리 내에 존재하는 버퍼에서 스트림을 읽어옴 
    // BufferedReader br = new BufferedReader(sr);
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    // 리스트 생성
    List<Integer> data = new ArrayList<>();
    String line;
    while((line = br.readLine()) != null){
      data.add(Integer.parseInt(line));
    }

    int sum = 0;
    for (int x : data){
      sum += x;
    }
    // System.out.println(sum);
    int a = 0;
    int b = 0;

    // 범인 찾기
    for (int i = 0; i < data.size(); i++){
      for (int j = i+1; j < data.size(); j++){
        if (sum - data.get(i) - data.get(j) == 100){
          a = data.get(i);
          b = data.get(j);
          break;
        }
      }
    }
    // 정렬 후
    Collections.sort(data);
    
    // 걸러서 출력
    for (int x : data){
      if (x != a && x != b)
        System.out.println(x);
    }
  }
    
}
