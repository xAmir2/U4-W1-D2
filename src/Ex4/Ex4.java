package Ex4;

import java.util.Scanner;

public class Ex4 {
    public static String launch() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a > 20) {
            a = 20;
        } else if (a < 0) {
            a = 20;
        }
        String s = "Seconds to launch  " + a + "\n";

        for (int i = a; i >= 1; i--) {
            if (i % 2 == 0) {
                s += "[OK]" + i + "\n";
            } else {
                s += "[CHECK]" + i + "\n";
            }
            if (i == 10) {
                s += "-------- Radio --------" + "\n";
            }
        }
        s += "-------- Launch time --------";
        return s;
    }
}
