import java.util.*;

public class solution_ex {
    public static long solution(long n) {
        String str = n + ""; // 이런 방법이..
        String maxS = "";
        ArrayList<Integer> ran = new ArrayList<>();
        ArrayList<Integer> cnvt = new ArrayList<>();
        ArrayList<Character> arr = new ArrayList<>();

        // 문자열을 정수타입으로 변환해서 리스트에 추가
        for (int i = 0; i < str.length(); i++) {
            int ni = str.charAt(i) - '0';
            ran.add(ni);
        }
        while (ran.size() > 0) {
            int max = 0;
            // 2. 마지막 배열이 남았을때, if조건문 실행하고 while문 탈출
            if (ran.size() == 1) {
                cnvt.add(ran.get(0));
                break;
            }
            // 1. ran List에 있는 가장 큰 수를 cnvt List에 add하고 해당 List원소 remove.
            for (int j = 0; j < ran.size(); j++) {
                if (max <= ran.get(j)) {
                    max = ran.get(j);
                }
            }
            cnvt.add(max);
            ran.remove(Integer.valueOf(max));
        }

        // Integer타입 List원소를 char타입으로 변환
        for (int k = 0; k < cnvt.size(); k++) {
            char chk = (char) (cnvt.get(k) + '0');
            arr.add(chk);
            // Character타입의 List원소를 하나씩 더해서, 문자열에 할당
            maxS += "" + arr.get(k);
        }

        long answer = Long.parseLong(maxS);
        return answer;
    }


    static void main() {
        System.out.println(solution(12345));
    }
}
