import java.util.*;

public class Cap {

    public static void main(String[] args) {

        HashSet<Character> hst = new HashSet<>();
        Scanner scn = new Scanner(System.in);

        String curr = scn.next();
        char c = curr.charAt(0);
        if (c >= 'a' && c <= 'z') {
            System.out.print((char) (c - ('a' - 'A')));
        } else {
            System.out.print(c);
        }

        for (int i = 1; i < curr.length(); i++) {
            System.out.print(curr.charAt(i));
        }

    }

}
