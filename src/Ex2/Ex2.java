package Ex2;

import java.util.Scanner;

public class Ex2 {
    public static String num() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number from 1 to 3");
        int num = input.nextInt();
        String a = switch (num) {
            case 1 -> "The spelling for the number you wrote is: one";
            case 2 -> "The spelling for the number you wrote is: two";
            case 3 -> "The spelling for the number you wrote is: three";
            default -> "Number not found";
        };
        return a;
    }
}
