public class Task3 {
    public static void main(String[] args) {
        int n = 13;
        int m = 7;
        String[][] arrayOfArrays = new String[n][m];
        int iterator = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                iterator++;
                arrayOfArrays[i][j] = String.format("%1$3s", iterator);
                System.out.print(arrayOfArrays[i][j] + " ");
            }
            System.out.println();
        }
    }
}
