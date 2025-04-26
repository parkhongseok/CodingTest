package divide_and_conquer;

public class 거듭제곱1 {
  static int pow(int a, int n){
    if (n == 1){
      return a;
    }
    return a * pow(a, n-1);
  }
  
  public static void main(String[] args) {
    int a = 3;
    int k = 4;
    int result = pow(a, k);
    System.out.println(result);
  }
}
