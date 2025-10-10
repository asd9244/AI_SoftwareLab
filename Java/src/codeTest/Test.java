package codeTest;

import java.util.*;

public class Test {
    static void main() {

//        문제 1. 문자열 길이
//        문자열 "ArtificialIntelligence"의 길이를 구하는 코드를 작성하시오.
        String task1 ="ArtificialIntelligence";
        System.out.println(task1.length());

//        문제 2. 문자열 포함 여부
//        문자열 "MachineLearning"이 "Learn"이라는 단어를 포함하는지 확인하는 코드를 작성하시오.
        String task2 = "MachineLearning";
        boolean task22 = task2.contains("Learn");
        System.out.println(task22);

//        문제 3. 문자열 시작/끝 확인
//        문자열 "2025-10-10"이 "2025"로 시작하고 "10"으로 끝나는지 확인하는 코드를 작성하시오.
        String task3 = "2025-10-10";
        if(task3.substring(0,4) == "2025" && task3.substring(8,10) == "10") {
            System.out.println("true");
        };
//        문제 4. 문자열 대소문자 변환
//        문자열 "JavaRocks"를 모두 대문자로 변환한 결과와 모두 소문자로 변환한 결과를 출력하는 코드를 작성하시오.

//        문제 5. 문자열 공백 제거
//        문자열 " ChatGPT is fun! "의 앞뒤 공백을 제거한 문자열을 출력하는 코드를 작성하시오.

    }
}
