package userManager;

import java.util.Scanner;

public class TernaryOperator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String P = "Positive";
        String N = "Negative";
        String Z = "Zero";

        System.out.print("정수 입력: ");
        int answer = sc.nextInt();

        String str = (answer > 0) ? P
                : (answer < 0) ? N
                : Z;

        System.out.println(str);
    }
}
