import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sex, age;
        sex = sc.nextInt();
        age = sc.nextInt();

        if (sex == 0) {
            if (age >= 19) System.out.println("MAN");
            else System.out.println("BOY");
        } else {    
            if (age >= 19) System.out.println("WOMAN");
            else System.out.println("GIRL");
        }
    }
}
