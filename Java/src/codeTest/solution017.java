package codeTest;

public class solution017 {
    public static long solution(int price, int money, int count) {
        // https://school.programmers.co.kr/learn/courses/30/lessons/82612
        // 부족한 금액 계산하기
        long answer = 0;
        long sum = 0;
        
        for (int i = 1; i <= count; i++) {
            sum += price*i;
        }
        if(sum < money) { // 돈이 충분하면 0 반환
            answer = 0;
        } else { // 돈이 부족하면, 차액 반환
            answer = sum - money;
        }
        return answer;
    }
    
    // 테스트
    static void main() {
        System.out.println(solution(1,1,1));
    }
}

