import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        if (a.length() != b.length()) {
            System.out.println(-1);
            return;
        }

        String doubled = a + a;
        int idx = doubled.indexOf(b);

        if (idx == -1) 
            System.out.println(-1);
        else 
            System.out.println(idx);
    }
}
