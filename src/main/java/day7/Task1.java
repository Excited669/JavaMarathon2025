/*
1 Для этого задания скопируйте класс Самолет из предыдущего дня в пакет текущего
дня.
В классе Самолет создать статический метод compareAirplanes, который в
качестве аргументов принимает два объекта класса Airplane (два самолета) и выводит
сообщение в консоль о том, какой из самолетов длиннее.
*/
package day7;

public class Task1 {
    public static void main(String[] args) {

        Airplane air1 = new Airplane("Mikky", 2010, 32, 10, 0);
        Airplane air2 = new Airplane("Carl", 2017, 48, 10, 0);
        Airplane.compareAirplanes(air1,air2);
    }
}

