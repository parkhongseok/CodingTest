package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class 계단오르기_2579 {
  static String test = """
6
6
10
13
9
8
1
""";

static void print(int[] L ){
    for (int i = 0; i < L.length; i++){
    System.out.print(L[i] + " ");
  }
  System.out.println();
}

static int solve(int[] steps, int n){
  if (n == 1) return steps[0];
  
  // dp table
  int[] firstStep = new int[n];
  int[] secondStep = new int[n];
  
  // init
  firstStep[0] = steps[0];
  secondStep[0] = steps[0];
  firstStep[1] = steps[1];
  secondStep[1] = firstStep[0] + steps[1];

  // get value
  for (int i = 2; i < n; i++){
    firstStep[i] = Math.max(secondStep[i-2] + steps[i], firstStep[i-2] + steps[i]);
    secondStep[i] = firstStep[i-1] + steps[i];
  }

  // then
  return Math.max(firstStep[n-1], secondStep[n-1]);
}


public static void main(String[] args) throws NumberFormatException, IOException {
  // given
  StringReader sr = new StringReader(test);
  // InputStreamReader sr = new InputStreamReader(System.in);
  BufferedReader br = new BufferedReader(sr);
  int n = Integer.parseInt(br.readLine());
  
  int[] steps = new int[n];
  for (int i = 0; i < n; i++){
    steps[i] = Integer.parseInt(br.readLine());
  }

  // when
  int answer = solve(steps, n);

  // then
  System.out.println(answer);
}
}
