// Реализовать программу номер 2 используя while
package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2 числа");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        a++; // не включая начальные значения то есть условно говоря если начинается с 5 то 5 не будет входить в диапозон

        if (a < b){
            while (a < b) {
                if (a % 5 == 0 && a % 10 != 0){
                    System.out.println(a);
                }
                a++;
            }
        }
        else {
            System.out.println("Не работает");
        }
    }
}
