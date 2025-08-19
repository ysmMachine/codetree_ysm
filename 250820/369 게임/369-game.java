import java.util.Scanner;

public class Main {
    public static boolean isThree(int num) {
        while (num != 0) {
            if (num % 10 == 3 || num % 10 == 6 || num % 10 == 9) return true;
            num /= 10;
        }
        return false;
    }


    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || isThree(i)) System.out.print(0 + " ");
            else System.out.print(i + " ");
        }
    }
}