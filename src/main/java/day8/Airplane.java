package day8;

class Airplane {

    String producer;
    int year;
    double length;
    double weight;
    double fuel_back;

    public Airplane(String producer, int year, double length, double weight, double fuel_back) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel_back = 0;
    }

    public String getProducer() {
        return producer;
    }
    public void setProducer(String producer) {
        this.producer = producer;
    }
    public double getFuel_back() {
        return fuel_back;
    }
    public void setFuel_back(double fuel_back) {
        this.fuel_back = fuel_back;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public void info(){
        System.out.println("Изготовитель: " + producer + ",год реализации: "
        + year + ",длинна: " + length + ",вес: " + weight +
                ",количество топлива в баке: " + fuel_back);
    }
    public double fillUp(int nFuel){
        return fuel_back += nFuel;
    }

    public String toString() {
        return "Изготовитель: " + producer + ",год реализации: "
                + year + ",длинна: " + length + ",вес: " + weight +
                ",количество топлива в баке: " + fuel_back;
    }

}
