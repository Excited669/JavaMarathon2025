/*
1 Создать строку, состоящую из чисел от 0 до 20000 Важно понимать, что это одна
строка, полученная конкатенацией (“склеиванием”) чисел из диапазона через пробел
(0 + “ “ + 1 + “ “ + 2 + … + 20000).
После создания такой строки, вызов System.out.println() на этой строке должен
вывести в консоль сразу все числа из диапазона:
0 1 2 3 4 5 6 7 8 9 10 11 12 … 19995 19996 19997 19998 19999 20000
Для того, чтобы почувствовать разницу в производительности между конкатенацией
обычных строк (класс String) и использовании StringBuilder, реализуйте
описанную задачу этими двумя способами, замеряя время работы программы.
 */
package day8;

public class Task1 {
    public static void main(String[] args) {

        StringBuilder res = new StringBuilder();
        long before = System.currentTimeMillis();

        for (int i = 0; i <= 1000; i++) {
            //res.append(i + " ");
            res.append(i).append(" ");
        }
        System.out.println(res.toString());
        long after = System.currentTimeMillis();
        System.out.println("StringBuilder: " + (after - before));


        String numbers = "";

        for (int i = 0; i <= 1000; i++) {
            numbers += i + " ";
        }
        System.out.println(numbers);
        System.out.printf("String: " + (after - before));
    }

}
