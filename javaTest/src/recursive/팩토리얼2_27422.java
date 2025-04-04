package recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.math.BigInteger;

public class 팩토리얼2_27422 {
  static int N;
  static String test = "20";


  static BigInteger factorial(int n){
    if (n == 0)
      return BigInteger.ONE;
    return factorial(n-1).multiply(BigInteger.valueOf(n));
  }

  public static void main(String[] args) throws IOException {
    // StringReader sr = new StringReader(test);
    InputStreamReader sr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(sr);
    N = Integer.parseInt(br.readLine());

    System.out.println(factorial(N));
  }
}
