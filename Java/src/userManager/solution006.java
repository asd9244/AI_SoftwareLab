package userManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class solution006 {

    public int solution(int[] numbers) {
//        int answer = 45;
//
//        for (int i = 0; i < numbers.length; i++) {
//            answer -= numbers[i];
//        }
        int answer = 0;

        for (int i = 1; i <= 9; i++) {
            int count = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (i == numbers[j]) {
                    count++;
                }
            }
            if (count == 0) {
                answer += i;
            }
        }


        return answer;
    }
}
