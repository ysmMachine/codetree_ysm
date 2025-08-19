import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char[] c = new char[3];
        int[] t = new int[3];

        int aCnt = 0;

        for (int i = 0; i < 3; i++) {
            c[i] = sc.next().charAt(0);
            t[i] = sc.nextInt();
        
            if (c[i] == 'Y') {
                if (t[i] >= 37) aCnt += 1;
            }
        }

        if (aCnt >= 2) System.out.println("E");
        else System.out.println("N");
    }
}
