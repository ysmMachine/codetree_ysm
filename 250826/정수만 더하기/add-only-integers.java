import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int sumVal = 0;

        for (char c : s.toCharArray()) 
            if (c >= '0' && c <= '9') 
                sumVal += (c - '0');
        
        System.out.print(sumVal);
    }
}