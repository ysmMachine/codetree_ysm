import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> dArr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String cmd = sc.next();
            if (cmd.equals("push_back")) {
                dArr.add(sc.nextInt());
            } else if (cmd.equals("pop_back")) {
                if (!dArr.isEmpty()) {
                    dArr.remove(dArr.size() - 1);
                }
            } else if (cmd.equals("get")) {
                int idx = sc.nextInt();
                System.out.println(dArr.get(idx - 1));
            } else if (cmd.equals("size")) {
                System.out.println(dArr.size());
            }
        }
    }
}
