import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int sumVal = 0;
        for (int i = n; i <= 100; i++)
            sumVal += i;

        System.out.println(sumVal);
    }
}