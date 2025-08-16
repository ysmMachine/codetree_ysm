import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        String s = sc.next();
        sc.nextLine();

        LinkedList<Character> li = new LinkedList<>();
        for (char c : s.toCharArray()) li.add(c);

        ListIterator<Character> it = li.listIterator(li.size());
        
        for (int i = 0; i < m; i++) {
            String[] cmd = sc.nextLine().split(" ");
            switch (cmd[0]) {
                case "L":
                    if (it.hasPrevious()) it.previous();
                    break;
                case "R":
                    if (it.hasNext()) it.next();
                    break;
                case "D":
                    if (it.hasNext()) {
                        it.next();
                        it.remove();
                    }
                    break;
                case "P":
                    it.add(cmd[1].charAt(0));
                    break;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (char c : li) sb.append(c);
        System.out.println(sb.toString());
    }
}
