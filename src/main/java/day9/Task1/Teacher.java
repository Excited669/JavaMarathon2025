package day9.Task1;

public class Teacher extends Human {

    String Subject;

    public Teacher(String name, String subject) {
        super(name);
        this.Subject = subject;
    }

    public String getSubject() {
        return Subject;
    }
    public void setSubject(String subject) {
        Subject = subject;
    }

    public void printInfo() {
        System.out.println("Этот преподаватель с именем " + getName());
        super.printInfo();
    }
}
