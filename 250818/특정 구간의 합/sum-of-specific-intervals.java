import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            int ans = 0;
            
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            // Please write your code here.

            for (int j = a1-1; j < a2; j++) ans += arr[j];
            System.out.println(ans);
        }
    }
}