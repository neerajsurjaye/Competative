import java.util.*;

public class RoundNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n-- != 0) {

            int curr = sc.nextInt();
            int mul = 1;
            ArrayList<Integer> ans = new ArrayList<>();

            while (curr != 0) {

                int val = curr % 10;

                if (val != 0) {
                    // System.out.print(val * mul + " ");
                    ans.add(val * mul);
                }

                mul *= 10;
                curr /= 10;

            }

            System.out.println(ans.size());
            for (int x : ans) {
                System.out.print(x + " ");
            }
            System.out.println();

        }

    }
}