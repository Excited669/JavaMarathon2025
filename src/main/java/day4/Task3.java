/*
3 Заполнить двумерный массив (матрицу) случайными числами от 0 до 50 Размер
матрицы задать m=12, n=8 (m - размерность по строкам, n - размерность по колонкам).
В консоль вывести индекс строки, сумма чисел в которой максимальна. Если таких
строк несколько, вывести индекс последней из них.
*/
package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        Random rand = new Random();
        int [] [] mass = new int [7][12];

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                mass[i][j] = rand.nextInt(50);
            }
        }
        int max = 0;
        int maxid = 0;
        for (int i = 0; i < mass.length; i++) {
            int sum = 0;
            for (int j = 0; j < mass[i].length; j++) {
                sum += mass[i][j];
            }
            if (sum >= max) {
                max = sum;
                maxid = i;
            }
        }

        System.out.println(maxid);



    }
}
