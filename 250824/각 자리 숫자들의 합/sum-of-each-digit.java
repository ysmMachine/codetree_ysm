import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sumVal = 0;

        while (n != 0) {
            sumVal += (n % 10);
            n /= 10;
        }

        System.out.print(sumVal);
    }
}