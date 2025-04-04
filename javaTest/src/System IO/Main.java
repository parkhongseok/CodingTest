import java.io.*;

class Main{
  static String data = """
  a
  b
  c
  d
  e
  f
  g
  """;
  // sysout.print는 정말 느리기 때문에 이 결과를 모아서 한 번에 출력
  static StringBuilder sb = new StringBuilder();

  // BufferedReader, BufferedWriter 사용
  public static void main(String[] args) throws IOException {

    // 1. System.in 은 바이트 스트림이다. 
    //    - 키보드 입력을 바이트 단위로 받음
    // 2. InputStreamReader는 바이트 스트림을 "문자 스트림"으로 변환해준다.
    //    - 여기서부터 읽을 수 있는 문자가 됨. 
    // 3. BufferedReader는 버퍼를 사용해 효율적으로 읽는다.
    //    - 한 번에 여러 줄의 입력을 처리 가능

    // 표준 입력을 받는 경우 
    // InputStreamReader inputStreamReader = new InputStreamReader(System.in);     
    
    // 사용자 정의 문자열을 스트림으로 변환하여, 표준 입력과 동일한 상태 만들기
    StringReader stringReader = new StringReader(data);
    
    // 아래에선 테스트 상황 또는 실재 표준 입력과 무관하게 스트림을 읽는 단계 (특히 버퍼를 사용하여 한줄씩 읽기가 기능해짐)
    BufferedReader br = new BufferedReader(stringReader);
    // BufferedReader br = new BufferedReader(inputStreamReader);
    

   // sysout.print는 정말 느리기 때문에 이 결과를 모아서 한 번에 출력
  // StringBuilder sb = new StringBuilder();

    String line;
    while ((line = br.readLine()) != null) {
        System.out.println(line);
    }

    // 또는 저장한 거 한번에 읽기
    sb.append("item").append(' ');
    System.out.print(sb.toString());


  }
}