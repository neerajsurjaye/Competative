import java.security.CryptoPrimitive;
import java.util.*;

public class Present {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int height = sc.nextInt();

        int currHeight = height;
        int spaces = height;
        int lvl = 0;
        for (int i = 0; i <= height; i++) {

            for (int j = 0; j < currHeight; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j <= lvl; j++) {
                System.out.print(j + " ");
            }

            for (int j = lvl - 1; j >= 0; j--) {
                System.out.print(j + " ");
            }

            System.out.println();

            lvl++;
            currHeight--;

        }

        lvl = 1;
        currHeight = height - 1;
        for (int i = 0; i < height; i++) {

            for (int j = 0; j < lvl; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j <= currHeight; j++) {
                System.out.print(j + " ");
            }

            for (int j = currHeight - 1; j >= 0; j--) {
                System.out.print(j + " ");
            }

            System.out.println();

            currHeight--;
            lvl++;

        }

    }
}