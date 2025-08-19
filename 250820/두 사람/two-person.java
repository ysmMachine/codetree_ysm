import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int aAge, bAge;
        char aSex, bSex;

        aAge = sc.nextInt();
        aSex = sc.next().charAt(0);

        bAge = sc.nextInt();
        bSex = sc.next().charAt(0);

        if ((aAge >= 19 && aSex == 'M') || (bAge >= 19 && bSex == 'M')) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
