import java.util.*;

public class Cipher {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();
        String message = sc.next();
        String out = "";
        int j = 2;

        for (int i = 0; i < message.length();) {
            out += message.charAt(i);
            i = i + j;
            j++;
        }

        System.out.println(out);

    }
}
