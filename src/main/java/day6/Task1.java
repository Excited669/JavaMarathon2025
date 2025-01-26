/*
В классах Автомобиль и Мотоцикл реализовать два метода:
info () - выводит в консоль строку “Это автомобиль” (или “Это мотоцикл”),
yearDifference () - принимает на вход число (год), и возвращает разницу между
переданным годом и годом выпуска транспортного средства
 */
package day6;

public class Task1 {
    public static void main(String[] args) {

        Car car = new Car();
        Motorbike moto = new Motorbike(2010,"black","Bmw");

        car.info();
        moto.info();
        car.setStartYer(2005);
        System.out.println(car.yearDiference(2010));
        System.out.println(moto.yearDiference(2011));
    }
}
