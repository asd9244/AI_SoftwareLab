package codeTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class solution016 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12917
    // 영문 대소문자열로 이루어진 문자열 s를 큰것부터 작은 순으로 정렬하는 메서드
    public static String solution(String s) {
        String answer = "";
        // 문자열을 쪼개서 리스트에 할당
        List<String> list = new ArrayList<>(Arrays.asList(s.split("")));

        // 리스트를 역순으로 정렬
        Collections.sort(list, Collections.reverseOrder());

        // 리스트 원소를 문자열에 차례대로 반복 할당
        for (String str : list) {
            answer += str;
        }

        return answer;
    }

    static void main() {
        System.out.println(solution("Zbcdefg"));
    }
}
