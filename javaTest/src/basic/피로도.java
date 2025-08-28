package basic;

class 피로도 {
  private int maxCount = 0;

  public void dfs(int nowK, int count, boolean[] visited, int[][] dungeons){
    maxCount = Math.max(maxCount, count);

    for (int i = 0; i < visited.length; i++){
      if (visited[i] == true || nowK < dungeons[i][0]){
        continue;
      }
      visited[i] = true;
      dfs(nowK - dungeons[i][1], count+1, visited, dungeons);

      visited[i] = false;
    }
  }

  public int solution(int k, int[][] dungeons) {
    int len = dungeons.length;
    boolean[] visited = new boolean[len];

    dfs(k, 0, visited, dungeons);

    return maxCount;
  }

// 사용할 때
  public static void main(String[] args) {
      피로도 sol = new 피로도(); // 객체를 생성
      int k = 80;
      int[][] D = {{80, 20}, {50, 40}, {30, 10}};
      int answer = sol.solution(k, D); // 객체의 메소드를 호출
      System.out.println(answer);
  }
}

