import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] s_arr = new String[3];
        int[] len_arr = new int[3];

        for (int i = 0; i < s_arr.length; i++) {
            s_arr[i] = sc.next();
            len_arr[i] = s_arr[i].length();
        }

        int maxLen = Math.max(len_arr[0], Math.max(len_arr[1], len_arr[2]));
        int minLen = Math.min(len_arr[0], Math.min(len_arr[1], len_arr[2]));

        System.out.println(maxLen - minLen);
    }
}
