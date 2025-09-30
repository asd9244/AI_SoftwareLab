package userManager;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Test {
    static void main() {
        String str = "AJASDKFDKjdkjkdjfkaKFAdkjfksja";

        String[] strA = new String[str.length()];

        for (int i = 0; i < strA.length; i++) {
            strA[i] = String.valueOf(str.charAt(i));
            strA[i] = str.substring(i, i+1);
            System.out.println(strA[i]);
        }

        Collections.sort(Arrays.asList(strA));

        System.out.println(Arrays.toString(strA).toUpperCase());
        System.out.println(Arrays.toString(strA).toLowerCase());

        Collections.reverse(Arrays.asList(strA));
        System.out.println(Arrays.toString(strA));

        Collections.sort(Arrays.asList(strA), Comparator.reverseOrder());
        System.out.println(Arrays.toString(strA));

    }
}
