import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        BigDecimal A = new BigDecimal(a);
        BigDecimal B = new BigDecimal(b);

        BigDecimal result = A.divide(B, 30, RoundingMode.DOWN)  
                             .setScale(20, RoundingMode.DOWN); 

        System.out.println(result.toPlainString());
    }
}
