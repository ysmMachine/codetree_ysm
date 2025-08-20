import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sumVal = 0;
        int cnt = 0;
        for (int i = a; i <= b; i++) {
            if (i % 5 == 0 || i % 7 == 0) {
                sumVal += i;
                cnt += 1;
            }
        }

        double avg = 0.0;
        avg = (double) sumVal / cnt; 

        System.out.printf("%d %.1f\n", sumVal, avg);
        sc.close();
    }
}