import java.util.*;

public class HelpFul {

    public static void main(String[] args) {

        HashSet<Character> hst = new HashSet<>();
        Scanner scn = new Scanner(System.in);

        String curr = scn.next();
        ArrayList<Integer> nums = new ArrayList<>();

        for (char x : curr.toCharArray()) {
            if (x >= '0' && x <= '9') {
                nums.add(x - '0');
            }
        }

        Collections.sort(nums);
        // Collections.reverse(nums);

        // System.out.println(nums);
        // for(int x : nums){}
        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i));
            if (i != nums.size() - 1) {
                System.out.print('+');
            }
        }

    }

}
