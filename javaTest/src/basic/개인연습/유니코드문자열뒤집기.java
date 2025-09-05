package basic.개인연습;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 유니코드문자열뒤집기 {

    public String reverseGrapheme(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        // 1. 그래핀 클러스터 단위로 문자열을 나누기
        List<String> graphemes = new ArrayList<>();
        BreakIterator iterator = BreakIterator.getCharacterInstance();
        iterator.setText(s);
        int start = iterator.first();
        for (int end = iterator.next(); end != BreakIterator.DONE; start = end, end = iterator.next()) {
            graphemes.add(s.substring(start, end));
        }

        // 2. 나눠진 그래핀 클러스터의 순서를 뒤집기
        Collections.reverse(graphemes);

        // 3. 뒤집힌 순서대로 다시 합치기
        return String.join("", graphemes);
    }

    public static void main(String[] args) {
        유니코드문자열뒤집기 reverser = new 유니코드문자열뒤집기();
        String y = "s👍3🛠️a";

        System.out.println("Original: " + y);
        System.out.println("Reversed: " + reverser.reverseGrapheme(y)); // "a🛠️3👍s" 출력
    }
}
