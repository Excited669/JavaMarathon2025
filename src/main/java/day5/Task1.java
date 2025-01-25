/*
1 Создать класс Автомобиль (англ. Car), с полями “Год выпуска”, “Цвет”, “Модель”.
Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль,
задать сеттером каждое поле, вывести в консоль значение каждого поля геттером.
Созданный вами класс должен отвечать принципам инкапсуляции.
 */
package day5;

public class Task1 {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setColor("Красный");
        car1.setName("Audi");
        car1.setStartYer(2017);
        System.out.println("Машина " + car1.getColor() + " цвета. " + car1.getName() + " " + car1.getStartYer() + " года выпуска.");
    }
}
class Car {
    private int startYer;
    private String color;
    private String model;

    public void setName(String model1){
        model = model1;
    }
    public String getName(){
        return model;
    }

    public void setColor(String color1){
        color = color1;
    }
    public String getColor(){
        return color;
    }
    public void setStartYer(int startYer1){
        startYer = startYer1;
    }
    public int getStartYer(){
        return startYer;
    }
}


