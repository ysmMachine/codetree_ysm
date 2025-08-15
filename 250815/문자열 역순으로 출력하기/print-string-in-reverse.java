import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String[] sArr = new String[4];

        for (int i = 0; i < 4; i++) sArr[i] = sc.nextLine();

        for (int i = 3; i >= 0; i--) {
            System.out.println(sArr[i]);
        }

    }
}