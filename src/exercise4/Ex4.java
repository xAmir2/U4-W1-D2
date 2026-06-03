package exercise4;

import java.util.Scanner;

public class Ex4 {
    public static String launchCountdown() {
        System.out.println("How many seconds to launch? (max 20)");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a > 20) {
            a = 20;
        } else if (a < 0) {
            a = 20;
        }
        StringBuilder s = new StringBuilder("Seconds to launch  ").append(a).append("\n");

        for (int i = a; i >= 1; i--) {
            if (i % 2 == 0) {
                s.append("[OK]").append(i).append("\n");
            } else {
                s.append("[CHECK]").append(i).append("\n");
            }
            if (i == 10) {
                s.append("-------- Stage Separation --------").append("\n");
            }
        }
        s.append("-------- 🚀Launch time🚀 --------");
        return s.toString();
    }
}
