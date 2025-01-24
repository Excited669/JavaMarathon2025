/*
3 Реализовать программу, которая 5 раз запрашивает от пользователя два числа -
делимое и делитель. Для этих двух чисел программа рассчитывает результат деления
и выводит его в консоль. Если пользователь вводит 0 в качестве делителя, вместо
того, чтобы останавливать работу цикла принудительно, мы пропускаем итерацию и
выводим в консоль сообщение “Деление на 0”.
Ключевое слово else использовать в этой программе нельзя.
*/
package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double input1, input2;

        for (int i = 0; i < 10; i++) { // 10 потому что мы вводим 2 числа и из за этого I прибавляется (сделанно не очень хорошо)
            input1 = scanner.nextDouble();
            input2 = scanner.nextDouble();
            if (input2 == 0){
                System.out.println("На ноль делить нельзя");
                continue;
            }
            System.out.println(input1 / input2);
            i++;

        }

    }
}
