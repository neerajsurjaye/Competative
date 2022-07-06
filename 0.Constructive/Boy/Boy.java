import java.util.*;

public class Boy {

    public static void main(String[] args) {

        HashSet<Character> hst = new HashSet<>();
        Scanner scn = new Scanner(System.in);

        String text = scn.nextLine();

        int count = 0;
        for (char x : text.toCharArray()) {
            if (!hst.contains(x)) {
                hst.add(x);
                count++;
            }
        }

        if (count % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }

    }

}
