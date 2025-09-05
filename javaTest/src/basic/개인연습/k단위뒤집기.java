package basic.개인연습;

public class k단위뒤집기 {
  public String solution(String str, int n){
    char[] chars = str.toCharArray();
    int l = 0, r = n-1;
    while (r < str.length()){
      int f = l; int b = r;
      while (f < b){
        char temp = chars[f]; chars[f] = chars[b]; chars[b] = temp;
        f++; b--;
      }
      l += n; r += n;
    }
    return new String(chars);
  }

  public String solution2(String str, int n ){
    char[] chars = str.toCharArray();
    int len = chars.length;
    for (int i = 0; i < len; i+= n){ // where i = left;
      int l = i; 
      int r = Math.min(i + n - 1, len - 1);

      while (l < r){
        char temp = chars[l]; chars[l] = chars[r]; chars[r] = temp;
        l++; r--;
      }
    }
    
    return new String(chars);
  }

  public static void main(String[] args) {
    k단위뒤집기 k = new k단위뒤집기();

    String str = "abcxyzijkXY";
    int n = 3;
    System.out.println("=== 1. ===");
    System.out.println(k.solution(str, n));

    System.out.println("=== 2. ===");
    System.out.println(k.solution2(str, n));
  }
}
