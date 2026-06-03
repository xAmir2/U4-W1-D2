package exercise1;

public class Ex1 {
    public static boolean oddOrEven(int n) {
        System.out.println("Is it even?");
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean leapYear(int year) {
        System.out.println("Is it a leap year?");
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            return true;
        } else {
            return false;
        }
    }
}
