/*
2 Создать класс Мотоцикл (англ. Motorbike), с полями “Год выпуска”, “Цвет”,
“Модель”. Создать экземпляр класса Мотоцикл, с помощью конструктора (сеттеры не
использовать). Придерживаться принципов инкапсуляции и использовать ключевое
слово this. Геттером получить год выпуска, цвет, модель, вывести значения в
консоль.
*/
package day5;

public class Task2 {
    public static void main(String[] args) {

        Motorbike moto = new Motorbike(2017, "black", "AUDI");
        System.out.println("Мотоцикл " + moto.getModel() + " " + moto.getColor() + " " + moto.getYear());

    }
}
class Motorbike {
    private int year;
    private String color;
    private String model;

    public Motorbike(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public int getYear() {
        return year;
    }
    public String getColor() {
        return color;
    }
    public String getModel() {
        return model;
    }
}
