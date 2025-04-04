package recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class 재귀의귀재_25501 {
  static StringBuilder sb = new StringBuilder();
  static int T;
//   static String test = """
// 5
// AAA
// ABBA
// ABABA
// ABCA
// PALINDROME""";

  static class RecursiveCount {
    int N = 0;
    String str;
    int isP;

    int recursion(String s, int l, int r){
      this.N ++;
      if(l >= r) return 1;
      else if(s.charAt(l) != s.charAt(r)) return 0;
      else return recursion(s, l+1, r-1);
    }
    int isPalindrome(String s){
      return recursion(s, 0, s.length()-1);
    }
    RecursiveCount(String str){
      this.str = str;
      this.isP = this.isPalindrome(str);
    }
  }
  
  public static void main(String[] args) throws IOException {
    // StringReader sr = new StringReader(test);
    InputStreamReader sr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(sr);

    T = Integer.parseInt(br.readLine());

    for (int i = 0; i < T; i++){
      String line = br.readLine();
      RecursiveCount recursiveCount = new RecursiveCount(line);
      sb.append(recursiveCount.isP).append(' ').append(recursiveCount.N).append('\n');
    }
    System.out.println(sb);
  }
}