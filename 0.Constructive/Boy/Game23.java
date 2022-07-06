import java.util.*;

public class Game23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (b % a != 0) {
            System.out.println(-1);
            return;
        }

        int num = b / a;
        int count = 0;

        // while (num != 1) {

        // if (num % 2 == 0) {
        // num /= 2;
        // count++;
        // } else if (num % 3 == 0) {
        // num /= 3;
        // count++;
        // }

        // }

        while (num % 2 == 0) {
            count++;
            num /= 2;
        }

        while (num % 3 == 0) {
            count++;
            num /= 3;
        }

        if (num != 1) {
            System.out.println(-1);
            return;
        }

        System.out.println(count);

    }
}
