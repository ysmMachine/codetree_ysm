import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        int start = 1;
        boolean isFlag = true;
        
        for (int i = 1; i <= a.length(); i++) {
            StringBuilder temp = new StringBuilder();

            for (int j = start; j < a.length(); j++) 
                temp.append(a.charAt(j));
            
            for (int k = 0; k < start; k++)
                temp.append(a.charAt(k));

            start++;

            if (temp.toString().equals(b)) {
                System.out.println(i);
                isFlag = false;
                break;
            }
        }

        if (isFlag)
            System.out.println(-1);
        
    }
}
