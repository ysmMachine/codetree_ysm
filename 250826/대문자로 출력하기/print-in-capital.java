import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') { 
                System.out.print((char)(c - 'a' + 'A'));
            } else if (c >= 'A' && c <= 'Z') { 
                System.out.print(c);
            }
        }
    }
}
