package codeTest;

import java.util.ArrayList;
import java.util.Arrays;

public class solution001 {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;

        String str = Integer.toString(x);
        //이름,전화번호,주소,비번
        //split(",");
        //010-1234-4567
        String[] a = str.split("-");
        //a[0] = 010
        //a[1] = 1234
        //a[2] = 4567
        ArrayList<String> strArray = new ArrayList<>(Arrays.asList(str.split("")));
//        ArrayList<String> strArray = new ArrayList<>(str.split(""));

        for (int i = 0; i < strArray.size(); i++) {
            sum += Integer.parseInt(strArray.get(i));
        }
        if ((x % sum) == 0) {
            return answer;
        }
        answer = false;

        return answer;
    }
}
