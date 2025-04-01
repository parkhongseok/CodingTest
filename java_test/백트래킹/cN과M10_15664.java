import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.io.StringReader;
import java.util.*;
import java.util.stream.Collectors;

public class cN과M10_15664 {
    // static String test = """
    //     4 2
    //     9 7 9 1
    //     """;

    static StringBuilder sb = new StringBuilder();
    static List<List<Integer>> indexCombs = new ArrayList<>();

    // 인덱스 조합을 구함
    public static void combine(int N, int M, List<Integer> comb, int start){
        if (comb.size() == M){
            indexCombs.add(new ArrayList<>(comb));
            return;
        }

        for (int i = start; i < N; i++){
            comb.add(i);
            combine(N, M, comb, i+1);
            comb.remove(comb.size()-1);
        }
    }

    public static void main(String[] args) throws IOException {
        // StringReader sr = new StringReader(test);
        InputStreamReader sr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(sr);
        String[] NM = br.readLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);

        String[] strNumbers = br.readLine().split(" ");
        List<Integer> nums = new ArrayList<>();
        for (String s : strNumbers) {
            nums.add(Integer.parseInt(s));
        }
        br.close();

        // 오름차순 정렬
        Collections.sort(nums);

        // 인덱스 조합 구하기
        combine(N, M, new ArrayList<>(), 0);

        // 조합된 인덱스를 값으로 변환
        Set<String> resultSet = new TreeSet<>();
        for (List<Integer> idxComb : indexCombs) {
            List<Integer> real = new ArrayList<>();
            for (int idx : idxComb) {
                real.add(nums.get(idx));
            }
            String line = real.stream()
                            .map(String::valueOf)
                            .collect(Collectors.joining(" "));
            resultSet.add(line);  // 문자열로 넣어 중복 제거 + 정렬
        }

        for (String s : resultSet) {
            sb.append(s).append("\n");
        }

        System.out.print(sb);
    }
}
