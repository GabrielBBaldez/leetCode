import java.io.IOException;

public class CheckIfItIsaStraightLine {
    public static void main(String[] args) throws IOException {
        int[][] coordinates = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}};
        System.out.println(checkStraightLine(coordinates));
    }

    public static boolean checkStraightLine(int[][] coordinates) {
        int linhas = coordinates.length;

        for (int i = 0; i < linhas -1; i++) {

            int x1 = coordinates[i][0];
            int y1 = coordinates[i][1];

            int x2 = coordinates[i + 1][0];
            int y2 = coordinates[i + 1][1];

            int x3 = coordinates[i + 2][0];
            int y3 = coordinates[i + 2][1];

            int inclinacao1 = (y2 - y1) * (x3 - x2);
            int inclinacao2 = (y3 - y2) * (x2 - x1);

            if (inclinacao1 != inclinacao2) {
                return false;
            }
        }
        return true;
    }
}
