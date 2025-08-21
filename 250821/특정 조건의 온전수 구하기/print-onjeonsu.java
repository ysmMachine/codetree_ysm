import java.util.Scanner;

public class Main {
    public static boolean isPerfect(int num) {
        return (num % 2 != 0) && (num % 10 != 5) && !(num % 3 == 0 && num % 9 !=0);
    }

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) 
            if (isPerfect(i))
                System.out.print(i + " ");
    }
}