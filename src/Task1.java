import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[][] arrayOfArrays = new int[10][10];
        Random rand = new Random();
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                arrayOfArrays[i][j] = rand.nextInt(10);
            }
        }

        while (true) {
            System.out.println("Введите число от 1 до 10: ");
            Scanner scan = new Scanner(System.in);
            int num;

            if (scan.hasNextInt()) {
                num = scan.nextInt();

                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 10; j++) {
                        arrayOfArrays[i][j] += num;
                        sum += arrayOfArrays[i][j];
                    }
                }
                break;
            } else {
                System.out.println("Вы ввели не число");
            }
        }

        System.out.println("Сумма всех элементов двухмерного массива: " + sum);
    }
}
