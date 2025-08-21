import java.util.Scanner;

public class Main {
    public static boolean isKindNum(int num) {
        return (num % 2 == 0) || (num % 3 == 0) || (num % 5 == 0);
    }

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (!isKindNum(i)) 
                cnt+=1;
        }

        System.out.println(cnt);
    }
}