import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sumVal = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            sumVal += num;
        }

        String s = Integer.toString(sumVal);

        StringBuilder ans = new StringBuilder();

        for (int i = 1; i < s.length(); i++) {
            ans.append(s.charAt(i));
        }

        ans.append(s.charAt(0));

        System.out.print(ans);
    }
}