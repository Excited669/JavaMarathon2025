/*
1 С клавиатуры вводится число n - размер массива. Необходимо создать массив
указанного размера и заполнить его случайными числами от 0 до 10 Затем вывести
содержимое массива в консоль, а также вывести в консоль информацию о:
а) Длине массива
б) Количестве чисел больше 8
в) Количестве чисел равных 1
г) Количестве четных чисел
д) Количестве нечетных чисел
е) Сумме всех элементов массива
*/
package day4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int count_8 = 0;
        int count_1 = 0;
        int chet = 0;
        int nechet = 0;
        int sum = 0;

        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(10);
            sum += array[i];

            if (array[i] > 8) {
                count_8++;
            }
            if (array[i] == 1) {
                count_1++;
            }
            if (array[i] % 2 == 0){
                chet++;
            }
            if (array[i] % 2 != 0){
                nechet++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.printf("Длина массива %d\n", size);
        System.out.printf("Количество чисел больше 8: %d\n", count_8);
        System.out.printf("Количество чисел равных 1: %d\n", count_1);
        System.out.printf("Количество четных чисел %d\n", chet);
        System.out.printf("Количество нечетных чисел %d\n", nechet);
        System.out.printf("Сумма всех элементов массива %d\n", sum);
    }
}