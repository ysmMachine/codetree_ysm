import java.util.Scanner;
public class Main {
    public static void printHelloWorld(int n) {
        if (n == 0) { return; }

        printHelloWorld(n-1);

        System.out.println("HelloWorld");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        printHelloWorld(n);
    }
}