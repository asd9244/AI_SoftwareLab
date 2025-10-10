package codeTest;

import java.util.*;

public class solution012 {
    public int[] solution(int[] arr) {

        // arr배열값 list에 할당
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }

        // List내 최솟값 반환
        int min = Collections.min(list);

        // 원소가 2개 이상일때 값이 가장 작은 원소를 제거
        if(list.size() > 1) {
            list.remove(Integer.valueOf(min));
        }

        // answer배열에 list값을 할당
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        // 할당받은 값이 1개면, 그 값을 -1로 채움
        if(answer.length < 2) {
            Arrays.fill(answer, -1);
        }

        return answer;
    }
}
