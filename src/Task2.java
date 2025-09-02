public class Task2 {
    public static void main(String[] args) {
        String[][] chessboard = new String[8][8];

        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard[i].length; j++) {
                if (i%2 == 0 && j%2 == 0 || (i%2 != 0 && j%2 != 0)) {
                    chessboard[i][j] = "W";
                    System.out.print(chessboard[i][j] + "  ");
                }else  {
                    chessboard[i][j] = "B";
                    System.out.print(chessboard[i][j] + "  ");
                }
            }
            System.out.println();
        }
    }
}
