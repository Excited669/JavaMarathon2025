package day9.Task1;

public class Student extends Human {

    private String name_group;

    public Student(String name, String name_group) {
        super(name);
        this.name_group = name_group;
    }

    public String getName_group() {
        return name_group;
    }
    public void setName_group(String name_group) {
        this.name_group = name_group;
    }
    public void printInfo() {
        System.out.println("Этот студент с именем " + getName());
        super.printInfo();
    }

}
