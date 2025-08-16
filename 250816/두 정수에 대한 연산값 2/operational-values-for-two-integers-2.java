import java.util.Scanner;
public class Main {
    public static void change_val(int[] arr) {
        if (arr[0] < arr[1]) {
            arr[0] += 10;
            arr[1] *= 2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        int[] arr = {a, b};
        change_val(arr);
        System.out.println(arr[0] + " " + arr[1]);
    }
}