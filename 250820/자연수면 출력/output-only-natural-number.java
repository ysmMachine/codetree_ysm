import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > 0) {
            for (int i = 0; i < b; i++)
                System.out.print(a);
        } else {
            System.out.println(0);
        }

    }
}