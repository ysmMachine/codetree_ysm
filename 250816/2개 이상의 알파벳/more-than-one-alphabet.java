import java.util.*;

public class Main {
    public static boolean isTwo(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        if (hm.size() >= 2) return true;

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        // Please write your code here.

        boolean twoFlag = isTwo(A);
        if (twoFlag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}