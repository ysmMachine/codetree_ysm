import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int start = 1;
        while (start <= n) {
            if (start % 3 == 0) System.out.print(start + " ");
            start += 1;
        }
        
    }
}