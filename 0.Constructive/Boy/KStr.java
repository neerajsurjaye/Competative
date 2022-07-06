import java.util.*;

public class KStr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        String inp = sc.next();

        if (inp.length() % k != 0) {
            System.out.println(-1);
            return;
        }

        HashMap<Character, Integer> hst = new HashMap<>();

        for (char x : inp.toCharArray()) {

            if (hst.containsKey(x)) {
                hst.put(x, hst.get(x) + 1);
            } else {
                hst.put(x, 1);
            }

        }

        for (int x : hst.values()) {

            if (x % (inp.length() / k) != 0) {
                System.out.println(-1);
                return;
            }

        }

        String single = "";
        for (char x : hst.keySet()) {

            int count = hst.get(x) / (inp.length() / k);
            while (count-- > 0) {
                single += x;
            }

        }
        // System.out.println(single);

        int count = inp.length() / k;

        while (count-- > 0) {
            System.out.print(single);
        }
    }
}
