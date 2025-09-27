
public class solution_ex {
    public int solution(int n) {
        int answer = 0;
        int a = 1;
        while(n >= a) {
            if((n%a) == 0) {
                answer += a;
            }
            a++;
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}



