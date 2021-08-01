package day6;

public class Task3 {
    public static void main(String[] args) {
        Student student = new Student("Иван");
        Teacher teacher = new Teacher("Ольга Николаевна", "Литература");
        teacher.evaluate(student);

    }
}
