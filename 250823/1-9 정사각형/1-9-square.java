import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 1;

        for (int i = 1; i <= n * n; i++) {
            System.out.print(cnt + "");
            cnt++;
            if (cnt > 9) cnt = 1;   

            if (i % n == 0) {       
                System.out.println();
            }
        }
    }
}
