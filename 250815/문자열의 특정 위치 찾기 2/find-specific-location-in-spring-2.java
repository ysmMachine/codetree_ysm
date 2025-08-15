import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);

        String[] sArr = new String[] {"apple", "banana", "grape", "blueberry", "orange"};

        int cnt = 0;

        for (String s : sArr) {
            if (s.charAt(2) == c || s.charAt(3) == c) {
                cnt += 1;
                System.out.println(s);
            }
        }

        System.out.println(cnt);
    }
}
