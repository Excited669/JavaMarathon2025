//package Tests.day6;
//
//import Tests.AbstractTest;
//import day6.Student;
//import day6.Teacher;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//
//public class Day6TeacherTest extends AbstractTest {
//    Teacher teacher = new Teacher("Oleg", "History");
//    Student student = new Student("Petr");
//
//    @Test
//    public void evaluate5() {
//        teacher.evaluate(student, 5);
//        assertEquals("Преподаватель Oleg оценил студента с именем Petr по предмету History на оценку отлично."
//                + System.lineSeparator(), getOutput(), "Оценка 5. Студент Олег, преподаватель Петр, предмет История.");
//    }
//
//    @Test
//    public void evaluate4() {
//        teacher.evaluate(student, 4);
//        assertEquals("Преподаватель Oleg оценил студента с именем Petr по предмету History на оценку хорошо."
//                + System.lineSeparator(), getOutput(), "Оценка 4. Студент Олег, преподаватель Петр, предмет История.\"");
//    }
//
//    @Test
//    public void evaluate3() {
//        teacher.evaluate(student, 3);
//        assertEquals("Преподаватель Oleg оценил студента с именем Petr по предмету History на оценку удовлетворительно."
//                + System.lineSeparator(), getOutput(), "Оценка 3. Студент Олег, преподаватель Петр, предмет История.\"");
//    }
//
//    @Test
//    public void evaluate2() {
//        teacher.evaluate(student, 2);
//        assertEquals("Преподаватель Oleg оценил студента с именем Petr по предмету History на оценку неудовлетворительно."
//                + System.lineSeparator(), getOutput(), "Оценка 2. Студент Олег, преподаватель Петр, предмет История.\"");
//    }
//
//    @Test
//    public void evaluateError() {
//        teacher.evaluate(student, 0);
//        assertEquals("Неправильная оценка"
//                + System.lineSeparator(), getOutput(), "Оценка 0");
//    }
//}
