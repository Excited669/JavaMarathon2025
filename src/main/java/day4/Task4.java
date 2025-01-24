/*
4 Создать новый массив размера 100 и заполнить его случайными числами из
диапазона от 0 до 10000
Найти максимум среди сумм трех соседних элементов. Для найденной тройки с
максимальной суммой выведите значение суммы и индекс первого элемента тройки.
*/
package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {

        Random rand = new Random();

        int mass [] = new int[10];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = rand.nextInt(10000);
        }
        System.out.println(Arrays.toString(mass));

        int maxSum = 0;
        int maxSumIdc = 0;
        for (int i = 0; i < mass.length - 2; i++) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum += mass[j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxSumIdc = i;
            }
        }
        System.out.println(maxSum);
        System.out.println(maxSumIdc);


    }
}
