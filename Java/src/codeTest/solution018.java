package codeTest;


public class solution018 {
    public boolean solution(String s) {
        // https://school.programmers.co.kr/learn/courses/30/lessons/12918
        boolean answer = false;
        if (s.length() == 6 || s.length() == 4) {
            for (int i = 0; i < s.length(); i++) {
                
                // char 메서드 .isDigit = 하나의 char를 검색하는 메서드, 숫자면 true, 아니면 false반환
                // String 메서드 .charAt = 문자열 s에서 (i)번째 문자열을 꺼냄
                if (!Character.isDigit(s.charAt(i))) {
                    return false;
                } else answer = true;
            }
        }
        return answer;
    }
}
