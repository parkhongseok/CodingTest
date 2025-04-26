package divide_and_conquer;

public class 거듭제곱3 {
  static int pow(int a, int n){
    if (n == 1){
      return a;
    }
    int x = pow(a, n/2);
    if (n%2==1){
      return a * x * x;
    }
    else {
      return x * x;
    }
  }

  public static void main(String[] args) {
    System.out.println(pow(3, 4));
  }
}
