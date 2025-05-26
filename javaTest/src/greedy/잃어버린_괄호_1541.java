package greedy;

import java.util.Scanner;

public class 잃어버린_괄호_1541 {
  static String test = "00009-00009";

  static int sum(String line){
    int result = 0;
    String[] strList = line.split("\\+");
    for (String num : strList){
      result += Integer.parseInt(num);
    }
    return result;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(test);
    // Scanner sc = new Scanner(System.in);
    String[] expressions = sc.nextLine().split("-");
    int answer = 0;
    // plus part
    answer += sum(expressions[0]);

    // minus part
    for (int i = 1; i < expressions.length; i++){
      answer -= sum(expressions[i]);
    }
    System.out.println(answer);
  }
}
