package basic;

public class N개의_최소공배수 {
  // Euclidean Algorithm
  public static int GCD(int a, int b){
    int r = a%b;
    if (r == 0){ 
      return b; 
    }
    return GCD(b, r);
  }

  public static int LCM(int a, int b){
    return a/GCD(a, b)*b;
  }

  public static int solution(int[] arr) {
    for (int i = 1; i < arr.length; i++){
      arr[i] = LCM(arr[i-1], arr[i]);
    }

    return arr[arr.length -1];
  }

    public static void main(String[] args) {
    int x = GCD(1071, 462);
    System.out.println(x);

    int[] arr = {2, 6, 8, 14};
    System.out.println(solution(arr)); //168
  }
}
