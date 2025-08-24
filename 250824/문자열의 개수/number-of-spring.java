import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> sArr = new ArrayList<>();

        int idx = 1;
        int cnt = 0;

        while (true) {
            String s = sc.next();
            if (s.equals("0")) 
                break;
            
            cnt++;

            if (idx % 2 != 0)
                sArr.add(s);

            idx++;
        }

        System.out.println(cnt);
        for (String s: sArr)
            System.out.println(s);
    }
}
