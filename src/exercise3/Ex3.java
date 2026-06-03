package exercise3;

import java.util.Scanner;

public class Ex3 {
    public static String commaString() {
        System.out.println("Enter a text");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        while (!str.equals(":q")) {
            String words = String.join(",", str.split(""));
            System.out.println(words);
            System.out.println("Enter a text or you can end the loop by typing :q");
            str = sc.nextLine();
        }
        return "Thanks for testing!";
    }
}
