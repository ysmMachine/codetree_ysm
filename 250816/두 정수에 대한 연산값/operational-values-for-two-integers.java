import java.util.Scanner;

public class Main {
    public static void change_val(int[] arr) {
        if (arr[0] < arr[1]) {
            arr[0] *= 2;
            arr[1] += 25;
        } else {
            arr[0] += 25;
            arr[1] *= 2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] arr = {a, b};
        change_val(arr);
        System.out.println(arr[0] + " " + arr[1]);
    }
}
