import java.util.Scanner;
public class Main {
    public static void printFirstLine(int start, int n) {
        if (start > n) return;

        System.out.print(start + " ");

        printFirstLine(start+1, n);
    }

    public static void printSecondLine(int n) {
        if (n == 0) return;

        System.out.print(n + " ");

        printSecondLine(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        printFirstLine(1, n);
        System.out.println();
        printSecondLine(n);
    }
}