package codeTest;

public class solution004 {
    public long solution(long n) {
        long answer = 0;
        long x = 0;
        while (x <= Math.sqrt(n)) {
            if (Math.pow(x, 2) == n) {
                answer = (long) Math.pow(x + 1, 2);
                break;
            } else answer = -1;
            x++;
        }
        return answer;
    }
}

