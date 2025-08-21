import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            boolean cond1 = (i % 2 == 0 && i % 4 != 0);
            boolean cond2 = ((i / 8) % 2 == 0);
            boolean cond3 = (i % 7 < 4);

            if (!cond1 && !cond2 && !cond3) {
                System.out.print(i + " ");
            }
        }
    }
}
