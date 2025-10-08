package codeTest;

import java.util.*;

public class solution012 {
    public List<Integer> solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        List<Integer> answer2 = new ArrayList<>();

        for (int num : arr) {
            answer.add(num);
        }

       Collections.sort(answer);
        int a = answer.get(0);

        for(int num : arr) {
            answer2.add(num);
        }

        if(answer2.size() > 1) {
            answer2.remove(a);

        } else {
            answer2.remove(0);
            answer2.add(-1);

        }

        return answer2;
    }
}
