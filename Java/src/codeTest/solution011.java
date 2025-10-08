package codeTest;

import java.util.ArrayList;
import java.util.Arrays;

public class solution011 {
    public String solution(String s) {
        String answer = "";

        String[] str = new String[s.length()];
        str = s.split("");

        if(str.length%2 != 0) {
            answer = str[str.length/2];
        } else {
            answer = str[(str.length/2) - 1] + str[str.length/2];
        }
        return answer;
    }
}
