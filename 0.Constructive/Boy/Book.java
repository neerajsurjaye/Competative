import java.util.*;

public class Book {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pages = sc.nextInt();

        int[] dayPages = new int[7];
        int week = 0;

        for (int i = 0; i < dayPages.length; i++) {
            dayPages[i] = sc.nextInt();
        }

        while (pages > 0) {

            pages -= dayPages[week];

            if (pages <= 0) {
                break;
            }

            week++;
            if (week == 7) {
                week = 0;
            }

        }
        System.out.println(week + 1);

    }
}
