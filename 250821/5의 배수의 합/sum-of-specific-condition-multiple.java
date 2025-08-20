import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sumVal = 0;
        int start, end;
        start = a < b ? a : b;
        end = a > b ? a : b;

        for (int i = start; i <=end; i++) 
            if (i % 5 == 0)
                sumVal += i;
        
        System.out.println(sumVal);
    }
}