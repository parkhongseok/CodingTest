package divide_and_conquer;

public class 거듭제곱2 {
  
  static int pow(int a, int n){
    if (n == 1){
      return a;
    }

    if (n%2 == 1){
      return a * pow(a, n/2) * pow(a, n/2);
    }
    else{
      return pow(a, n/2)* pow(a, n/2);
    }
  }
  public static void main(String[] args) {
    System.out.println(pow(3, 4));
  }
}
