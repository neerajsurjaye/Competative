import java.util.*;

public class Substraction {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int n = sc.nextInt();

        while (n-- != 0) {

            if (num % 10 == 0) {
                num /= 10;
            } else {
                num -= 1;
            }

        }

        System.out.println(num);

    }
}
