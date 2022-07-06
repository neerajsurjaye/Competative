import java.util.*;

public class Boring {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n-- > 0) {
            String end = sc.next();
            int count = 0;

            for (int i = 1; i <= 9; i++) {
                String out = "";
                boolean brk = false;

                for (int j = 0; j < 4; j++) {

                    out += i;
                    count += out.length();

                    // System.out.println(out + " " + end);
                    if (out.equals(end)) {
                        System.out.println(count);
                        brk = true;
                        break;
                    }

                }

                if (brk) {
                    break;
                }
            }

        }

    }
}
