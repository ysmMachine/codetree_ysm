import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        for (char c : s.toCharArray()) {
            if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
                if (c >= 65 && c <= 90)
                    System.out.print((char)(c - 65 + 97));
                else
                    System.out.print(c);
            } else if (c >= '0' && c <= '9') {
                System.out.print(c);
            }
        }
    }
}