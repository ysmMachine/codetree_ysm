import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        String ab = a + b;
        String ba = b + a;

        System.out.println(Integer.parseInt(ab) + Integer.parseInt(ba));
    }
}
