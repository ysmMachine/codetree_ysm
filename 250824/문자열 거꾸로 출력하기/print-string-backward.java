import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String s = sc.next();
            if (s.equals("END")) break;

            for (int i = s.length() - 1; i >= 0; i--)
                System.out.print(s.charAt(i));
            System.out.println();
        }
    }
}
