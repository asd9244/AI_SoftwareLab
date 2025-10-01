package codeTest;

public class solution010 {
    public StringBuilder solution(String phone_number) {
        StringBuilder sb = new StringBuilder(phone_number);

        for (int i = 0; i < sb.length()-4; i++) {
            sb.replace(i, i+1, "*");
        }
        return sb;
    }
}
