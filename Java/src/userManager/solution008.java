package userManager;

import java.text.MessageFormat;

public class solution008 {

    public String solution(String[] seoul) {
        String answer = "";

        for (int i = 0; i < seoul.length; i++) {
            if(seoul[i].equals("Kim")) {
                answer = MessageFormat.format("김서방은 {0}에 있다", i);
            }
        }
        return answer;
    }
}
