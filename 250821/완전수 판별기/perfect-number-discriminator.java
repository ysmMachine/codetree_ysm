import java.util.Scanner;

public class Main {
    public static boolean isPerfectNumber(int num) {
        int sumVal = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) sumVal += i;
        }

        return (sumVal == num);
    }
    
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char ans = isPerfectNumber(n) ? 'P' : 'N';
        System.out.println(ans);

    }
}