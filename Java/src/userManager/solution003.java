package userManager;

import java.util.*;

public class solution003 {

    boolean solution(String s) {
        boolean answer = true;
        int p = 0, y = 0;
        String lowerCase = s.toLowerCase();

        for (int i = 0; i < lowerCase.length(); i++) {
            if (lowerCase.charAt(i) == 'p') p++;
            if (lowerCase.charAt(i) == 'y') y++;
        }

        if(p != y) {
            answer = false;
        }

        return answer;
    }
}
