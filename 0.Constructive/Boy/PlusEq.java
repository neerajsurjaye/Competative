import java.util.*;

public class PlusEq {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n-- > 0) {

            int a = sc.nextInt();
            int b = sc.nextInt();

            int c = sc.nextInt();

            int count = 0;

            while (a <= c && b <= c) {

                if (a <= b) {
                    a += b;
                }

                else if (b < a) {
                    b += a;
                }

                count++;

            }

            System.out.println(count);

        }

    }

}
