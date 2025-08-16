import java.util.Scanner;

public class Main {
    public static void to_absolute_value(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) arr[i] *= -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        to_absolute_value(arr);

        for (int num: arr) 
            System.out.print(num + " ");

    }
}