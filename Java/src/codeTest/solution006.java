package codeTest;

public class solution006 {

    public int solution(int[] numbers) {
//        int answer = 45;
//
//        for (int i = 0; i < numbers.length; i++) {
//            answer -= numbers[i];
//        }
        int answer = 0;

        for (int i = 0; i < 10; i++) {  // {  1 3 5 7 }
            int check = 0;
            for (int j = 0; j < numbers.length; j++) { // 0 1 2 3 4 5 6 7 8 9
                if(numbers[j] == i) {
                    check++;
                }
                if(check == 0) {
                    answer += i;
                }
            }
        }
        return answer;


    }
}
