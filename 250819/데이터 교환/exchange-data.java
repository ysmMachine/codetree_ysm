public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        int a = 5, b = 6, c = 7;
        int tempA = a;
        int tempB = b;

        a = c;
        b = tempA;
        c = tempB;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}