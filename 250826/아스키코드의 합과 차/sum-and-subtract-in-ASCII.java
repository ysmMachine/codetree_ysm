import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        char c1 = sc.next().charAt(0);
        char c2 = sc.next().charAt(0);

        int i1 = (int)c1;
        int i2 = (int)c2;

        int plus = i1 + i2;
        int minus = (i1 > i2) ? (i1 - i2) : (i2 - i1);

        System.out.println(plus + " " + minus);
    }
}