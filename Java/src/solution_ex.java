import java.util.*;

public class solution_ex {
    public long solution(long n) {
        StringBuilder reverse = new StringBuilder();

        String str = Long.toString(n);
        ArrayList<String> strList = new ArrayList<>(Arrays.asList(str.split("")));

        Collections.sort(strList, Collections.reverseOrder());


        for (String str2 : strList) {
            reverse.append(str2);
        }
        long answer = Long.parseLong(reverse.toString());

        return answer;
    }
}
