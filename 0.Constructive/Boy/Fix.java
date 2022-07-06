import java.util.*;

public class Fix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n-- > 0) {

            int y = sc.nextInt();
            int x = sc.nextInt();

            char[][] grid = new char[y][x];

            for (int i = 0; i < y; i++) {
                String line = sc.next();

                for (int j = 0; j < x; j++) {

                    grid[i][j] = line.charAt(j);

                }
            }

            int inv = 0;
            for (int i = 0; i < grid.length; i++) {
                if (grid[i][x - 1] == 'R') {
                    inv++;
                }
            }

            for (int i = 0; i < grid[0].length; i++) {
                if (grid[y - 1][i] == 'D') {
                    inv++;
                }
            }

            System.out.println(inv);

        }

    }
}