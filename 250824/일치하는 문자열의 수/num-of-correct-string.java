import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s1 = sc.next();

        int cnt = 0;

        for (int i = 0; i < n; i++) {
            String s2 = sc.next();
            if (s1.equals(s2)) cnt++;
        }

        System.out.println(cnt);
    }
}
