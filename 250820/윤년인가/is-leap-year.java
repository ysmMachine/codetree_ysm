import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year;
        year = sc.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 != 0) System.out.println("false");
            else System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
