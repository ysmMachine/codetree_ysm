import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int sumVal = 0;
        int cnt = 0;

        for (int i = 1; i <=10; i++) {
            int num = sc.nextInt();
            if (num >= 0 && num <= 200) {     
                sumVal += num;
                cnt++;
            }
        }

        double avg = (double)sumVal / cnt;
        System.out.printf("%d %.1f", sumVal, avg);
    }
}