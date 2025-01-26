package day6;

public class Task3 {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Анна Николавна", "Математика");
        Student student = new Student();
        teacher.setCourse("Обществознание");
        student.setName("Коля");

        System.out.println("Преподаватель " + teacher.getName() + " оценил студента с именем " + student.getName() + " по" +
                " предмету " + teacher.getCourse() + " на оценку " + teacher.evolute(student));
    }
}
