import java.util.*;

public class Boring {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n-- > 0) {
            String curr = sc.next();

            int last = -1;

            for (int i = curr.length() - 1; i >= 0; i--) {
                if (curr.charAt(i) == '1') {
                    last = i;
                    break;
                }
            }

            int count = 0;
            boolean isOne = false;
            for (int i = 0; i < last; i++) {

                if (curr.charAt(i) == '1') {
                    isOne = true;
                }

                if (isOne == true && curr.charAt(i) == '0') {
                    count++;
                }

            }

            System.out.println(count);

        }

    }
}
