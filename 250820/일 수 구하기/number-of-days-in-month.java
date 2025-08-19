import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(day[n-1]);
    }
}
