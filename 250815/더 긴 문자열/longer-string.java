import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();

        String ans_str = s1.length() > s2.length() ? s1 : (s1.length() == s2.length() ? "same" : s2);
        int ans_len = ans_str.length();

        if (ans_str.equals("same")) {
            System.out.println(ans_str);
        } else {
            System.out.println(ans_str + " " + ans_len);
        }
    }
}
