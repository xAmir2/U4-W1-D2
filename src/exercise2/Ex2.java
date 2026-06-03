package exercise2;

import java.util.Scanner;

public class Ex2 {
    public static String numberSpelling() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number from 1 to 3");
        int num = input.nextInt();
        return switch (num) {
            case 1 -> "The spelling for the number you wrote is: one";
            case 2 -> "The spelling for the number you wrote is: two";
            case 3 -> "The spelling for the number you wrote is: three";
            default -> "Number not found";
        };
    }
}
