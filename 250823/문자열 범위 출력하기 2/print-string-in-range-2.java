import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int n = sc.nextInt();

        if (n >= s.length()-1) {
            for (int i = s.length()-1; i >= 0; i--)
                System.out.print(s.charAt(i));
        } else {
            for (int i = s.length()-1; i>s.length()-1-n; i--) 
                System.out.print(s.charAt(i));      
        }
    }
}
