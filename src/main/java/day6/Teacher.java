package day6;


import java.util.Random;

class Teacher {
    private String name;
    private String schObject;
    private String assessment2;

    public Teacher(String name, String schObject) {
        this.name = name;
        this.schObject = schObject;
    }

    public String getName() {
        return name;
    }

    public String getSchObject() {
        return schObject;
    }

    public void evaluate(Student student) {
        Random random = new Random();
        switch (random.nextInt(6 - 2) + 2) {
            case 2:
                assessment2 = "Неудовлетворительно";
                break;
            case 3:
                assessment2 = "Удовлетворительно";
                break;
            case 4:
                assessment2 = "Хорошо";
                break;
            case 5:
                assessment2 = "Отлично";
                break;

        }
        System.out.println("Преподаватель " + getName() + " оценил студента с именем "
                + student.getName() + " по предмету " + getSchObject() + " на оценку " + assessment2 + ".");

    }
}
