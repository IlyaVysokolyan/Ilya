package day6;



import java.util.Random;

class Teacher {
    private String name;
    private String schObject;

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

    public Student evaluate(Student student){
        Random random = new Random();
        int assessment = random.nextInt(6-2)+2; //Генератор оценки
        System.out.println("Преподаватель "+getName() + " оценил студента с именем "
                +student.getName() + " по предмету " + getSchObject()+" на оценку "+assessment+".");
        return student;
    }
}
