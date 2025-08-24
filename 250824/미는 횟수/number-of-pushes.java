import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        boolean isFlag = true;

        for (int i = 1; i <= a.length(); i++) {
            String rotated = a.substring(a.length() - i) + a.substring(0, a.length() - i);

            if (rotated.equals(b)) {
                System.out.println(i);
                isFlag = false;
                break;
            }
        }

        if (isFlag)
            System.out.println(-1);
    }
}
