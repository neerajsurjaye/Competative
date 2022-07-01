import java.util.*;

public class bitpp {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int x = 0;

        while (n-- != 0) {

            String curr = scn.next();

            for (char chr : curr.toCharArray()) {

                if (chr == '+' || chr == '-') {

                    x += (chr == '+' ? 1 : -1);

                    break;
                }

            }
        }

        System.out.println(x);
        scn.close();
    }
}