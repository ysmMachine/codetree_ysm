import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        for (int i = a; i <= 100; i++) {
            if (i >= 90) System.out.print("A ");
            else if (i >= 80) System.out.print("B ");
            else if (i >= 70) System.out.print("C ");
            else if (i >= 60) System.out.print("D ");
            else System.out.print("F ");
        }
    }
}