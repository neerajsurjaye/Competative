import java.lang.reflect.Array;
import java.util.*;

public class Classes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();

        while (k-- > 0) {

            int n = sc.nextInt();
            n = n * 2;

            int[] arr = new int[n];

            int idx = 0;
            while (n-- > 0) {
                arr[idx++] = sc.nextInt();
            }

            Arrays.sort(arr);
            // System.out.println(Arrays.toString(arr));

            int fi = arr[arr.length / 2];
            int sec = arr[(arr.length / 2) - 1];

            System.out.println(Math.abs(sec - fi));
        }

    }
}
