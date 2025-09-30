package userManager;

public class solution005 {

    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i]) {
                answer += absolutes[i];
            } else {
                answer += Math.negateExact(absolutes[i]);
            }
        }
        return answer;
    }
}
