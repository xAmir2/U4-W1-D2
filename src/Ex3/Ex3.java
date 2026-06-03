package Ex3;

import java.util.Objects;
import java.util.Scanner;

public class Ex3 {
    public static String str() {
        System.out.println("Enter a text");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        while (!Objects.equals(str, ":q")) {
            String words = str.replace("", ",");
            System.out.println(words);
            System.out.println("Enter a text or you can end the loop by typing :q");
            str = sc.nextLine();
        }
        return str;
    }
}
