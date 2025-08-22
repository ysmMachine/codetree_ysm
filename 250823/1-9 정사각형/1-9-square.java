import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 1;

        for (int i = 1; i <= n*n; i++) {
            if (i % n == 0) {
                System.out.println(cnt++);
                continue;
            }
            System.out.print(cnt++ + "");

            if (cnt > 9) cnt = 1;
        }        
    }
}