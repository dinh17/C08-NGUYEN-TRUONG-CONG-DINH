package ss5_access_modifier_static_method_static_property.exercise.StudentClasses;

public class Student {
    private static String name;
    private static String classes;

    public Student() {
        name = "John";
        classes = "C02";
    }

    public Student(String name, String classes) {
        Student.name = name;
        Student.classes = classes;
    }


    public String toString() {
        return " " + name + " and " + classes;
    }
}
