import java.util.*;

public class Task {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String inp = sc.next();

        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('y');

        String out = "";
        int diff = 'a' - 'A';

        for (char x : inp.toCharArray()) {

            if (vowels.contains(x) || vowels.contains((char) (x + diff))) {
                continue;
            }

            if (x <= 'Z') {
                out += "." + (char) (x + diff);
            } else {
                out += "." + x;
            }

        }

        System.out.println(out);

    }
}