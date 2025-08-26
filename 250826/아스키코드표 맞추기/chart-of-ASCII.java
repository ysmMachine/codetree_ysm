import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        char[] cArr = new char[5];

        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            cArr[i] = (char)num;
            System.out.print(cArr[i] + " ");
        }
    }
}