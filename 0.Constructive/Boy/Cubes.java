import java.util.*;

public class Cubes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cubes = sc.nextInt();
        int level = 1;
        int currCubes = 0;

        int lvl = 0;

        while (cubes >= 0) {

            currCubes += level;

            if (currCubes <= cubes) {
                lvl++;
            } else {
                break;
            }

            cubes -= currCubes;
            level++;

            // System.out.println(cubes + " " + level + " " + currCubes);

        }

        System.out.println(lvl);

    }

}
