import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        if (a > 20 || a < 10) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}