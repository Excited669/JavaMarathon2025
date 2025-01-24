/*
1 Реализовать программу, которая в консоль выводит название страны, принимая на
вход название города. Программа должна работать до тех пор, пока не будет введено
слово “Stop”.
Реализовать, используя следующие данные:
Москва, Владивосток, Ростов - Россия
Рим, Милан, Турин - Италия
Ливерпуль, Манчестер, Лондон - Англия
Берлин, Мюнхен, Кёльн - Германия
При вводе любого другого города, вывести сообщение “Неизвестная страна”.
*/
package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String city;

        while (true){
            System.out.print("Введите название города (или 'Stop' для выхода): ");
            city = scanner.nextLine();
            if (city.equals("Stop")){
                break;
            }
            else{
                switch (city.toLowerCase()) {
                    case ("москва"):
                    case ("ростов"):
                    case ("владивосток"):
                        System.out.println(" - Россия");
                        break;
                    case ("рим"):
                    case ("милан"):
                    case ("турин"):
                        System.out.println(" - Италия");
                        break;
                    case ("ливерпуль"):
                    case ("манчестер"):
                    case ("лондон"):
                        System.out.println(" - Англия");
                        break;
                    case ("кёльн"):
                    case ("мюнхен"):
                    case ("берлин"):
                        System.out.println(" - Германия");
                        break;
                    default:
                        System.out.println("Неизвестная страна");
                }
            }
        }
    }
}