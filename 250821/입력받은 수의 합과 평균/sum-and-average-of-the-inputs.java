import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int sumVal = 0;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            sumVal += num;
        }

        double avg = (double)sumVal / n;
        System.out.printf("%d %.1f", sumVal, avg);
    }
}