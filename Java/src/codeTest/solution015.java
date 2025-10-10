package codeTest;

public class solution015 {
    public static int solution(int left, int right) {
        int answer = 0;

        for (int i = 0; i <= right-left; i++) {
            int count = 0;
            for (int j = 1; j <= right-i; j++) {
                if((right-i)%j == 0) {
                    count++;
                }
            }
            if(count%2 != 0) {
                answer -= (right-i);
            } else {
                answer += (right-i);
            }
        }

        return answer;
    }
}
