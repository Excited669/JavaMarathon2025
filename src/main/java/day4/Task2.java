/*
2 Создать новый массив размера 100 и заполнить его случайными числами из
диапазона от 0 до 10000
Затем, используя циклы for each вывести:
-
наибольший элемент массива
-
наименьший элемент массива
-
количество элементов массива, оканчивающихся на 0
-
сумму элементов массива, оканчивающихся на 0
*/
package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        Random rand = new Random();

        int count = 0, sum = 0;

        int [] mass = new int[10000];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = rand.nextInt(10000);
        }
        int max = 0, min = 0;
        for (int num: mass) {
            max = Math.max(max, num);
            min = Math.min(min, num);
            if (mass[num] % 10 == 0) {
                count++;
            }
            if (mass[num] % 10 == 0) {
                sum +=mass[num];
            }
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(count);
        System.out.println(sum);



    }
}
