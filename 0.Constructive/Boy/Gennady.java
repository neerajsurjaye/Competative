import java.util.*;

public class Gennady {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String table = sc.next();
        int n = 5;

        while (n-- > 0) {

            String curr = sc.next();

            if (table.charAt(0) == curr.charAt(0) || table.charAt(1) == curr.charAt(1)) {
                System.out.println("YES");
                // break;
                return;
            }

        }

        System.out.println("NO");

    }

}
