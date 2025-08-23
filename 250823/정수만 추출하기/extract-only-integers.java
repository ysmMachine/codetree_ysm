import java.util.Scanner;

public class Main {
    public static int getFirstNum(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                break;
            } else {
                sb.append(s.charAt(i));
            }
        }
        
        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        int n1 = getFirstNum(s1);
        int n2 = getFirstNum(s2);

        System.out.println(n1 + n2);
    }
}
