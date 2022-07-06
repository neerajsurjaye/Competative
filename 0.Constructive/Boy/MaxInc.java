import java.util.*;

public class MaxInc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        while (n-- > 0) {
            arr.add(sc.nextInt());
        }

        int count = 0;
        int prev = arr.get(0) - 1;
        int max = 0;

        for (int x : arr) {
            if (x > prev) {
                count++;
            } else {
                count = 1;
            }

            prev = x;

            if (count > max) {
                max = count;
            }
        }

        System.out.println(max);

    }

}
