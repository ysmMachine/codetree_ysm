import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int cnt = 0;

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            if (num % 2 == 1) 
                cnt += 1;
        }

        System.out.println(cnt);

    }
}