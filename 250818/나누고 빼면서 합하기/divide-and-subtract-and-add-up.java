import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.

        int ans = 0;

        while (m != 1) {
            ans += (arr[m]);
            m = m % 2 == 0 ? (m / 2) : (m - 1); 
        }

        ans += (arr[m]);

        System.out.println(ans);
    }
}