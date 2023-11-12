package Task1;

import java.util.Random;
import java.util.Arrays;
public class Loterry {

    public static void main(String[] args) {

        int[] balls = new int[100];
        for (int i = 0; i < 100; i++) {
            balls[i] = i + 1;
        }

        shuffleArray(balls);

        // Выводим первые 10 значений в консоль
        for (int i = 0; i < 10; i++) {
            System.out.print(balls[i] + "; ");
        }
    }

    // Реализация алгоритма Фишера-Йетса для перемешивания массива
    private static void shuffleArray(int[] array) {
        Random rnd = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }
}