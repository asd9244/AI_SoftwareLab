package codeTest;

public class solution002 {

    public long solution(int a, int b) {
        long answer = 0;
        long min = Math.min(a, b);
        long max = Math.max(a, b);

        while(min <= max) {
            answer += min;
            min++;
        }
        return answer;
    }
}
