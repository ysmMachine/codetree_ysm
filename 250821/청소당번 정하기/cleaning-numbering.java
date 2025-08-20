import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n_2 = 0, n_3 = 0, n_12 = 0;

        int days = sc.nextInt();
        for (int i = 0; i <= days; i++) {
            if (i != 0) {
                if (i % 12 == 0) {
                    n_12++;
                } else if (i % 3 == 0) {
                    n_3++;
                } else if (i % 2 == 0) {
                    n_2++;
                }
            }
        }

        System.out.println(n_2 + " " + n_3 + " " + n_12);
    }
}