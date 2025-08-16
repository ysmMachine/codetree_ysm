import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        LinkedList<Integer> li = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String command = sc.next();

            switch (command) {
                case "push_front":
                    li.addFirst(sc.nextInt());
                    break;
                case "push_back":
                    li.addLast(sc.nextInt());
                    break;
                case "pop_front":
                    System.out.println(li.isEmpty() ? -1 : li.pollFirst());
                    break;
                case "pop_back":
                    System.out.println(li.isEmpty() ? -1 : li.pollLast());
                    break;
                case "size":
                    System.out.println(li.size());
                    break;
                case "empty":
                    System.out.println(li.isEmpty() ? 1 : 0);
                    break;
                case "front":
                    System.out.println(li.isEmpty() ? -1 : li.peekFirst());
                    break;
                case "back":
                    System.out.println(li.isEmpty() ? -1 : li.peekLast());
                    break;
            }
        }
    }
}
