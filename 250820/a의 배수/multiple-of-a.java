import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();

        int num = 1;
        while (num <= n) {
            if (num % a == 0) System.out.println(1);
            else System.out.println(0);
            num += 1;
        }

        
    }
}