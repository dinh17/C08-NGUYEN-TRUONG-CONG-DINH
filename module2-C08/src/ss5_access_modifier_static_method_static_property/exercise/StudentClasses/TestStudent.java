package ss5_access_modifier_static_method_static_property.exercise.StudentClasses;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        display(student);
        //
        Student student1 = new Student("Định", "C02");
        display(student1);

    }

    public static void display(Student student) {
        System.out.println(student.toString());
    }
}
