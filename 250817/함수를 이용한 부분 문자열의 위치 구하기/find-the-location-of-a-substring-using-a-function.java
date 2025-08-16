import java.util.Scanner;

public class Main {

    public static int isSubString(String text, String pattern) {
        if (pattern.isEmpty()) return -1;
        int n = text.length(), m = pattern.length();
        if (m > n) return -1;

        for (int i = 0; i <= n - m; i++) {
            if (text.charAt(i) == pattern.charAt(0)) {
                if (text.regionMatches(i, pattern, 0, m)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String pattern = sc.next();
        System.out.println(isSubString(text, pattern));
    }
}
