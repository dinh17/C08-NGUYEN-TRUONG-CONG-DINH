package ss10_DSA_danh_sach.java_util_ArrayList;


import ss10_DSA_danh_sach.java_util_ArrayList.MyArrayList;

public class TestMyArrayList {
    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student a = new Student(1, "Huy");
        Student b = new Student(2, "Thèm");
        Student c = new Student(3, "Mai ");
        Student d = new Student(4, "Thuý");
        Student e = new Student(5, "Quá");

        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
        MyArrayList<Student> newsMyArrayList = new MyArrayList<>();
        studentMyArrayList.add(a);
        studentMyArrayList.add(b);
        studentMyArrayList.add(c);
        studentMyArrayList.add(d);
//        studentMyArrayList.add(e);
        System.out.println(studentMyArrayList.size());
//        for (int i = 0; i <studentMyArrayList.size() ; i++) {
//            Student student =(Student) studentMyArrayList.elements[i];
//            System.out.println(student.getId());
//            System.out.println(student.getName());
//        }
//        System.out.println(studentMyArrayList.get(2).getName());
        System.out.println(studentMyArrayList.indexOf(c));
        System.out.println(studentMyArrayList.containt(e));
        newsMyArrayList = studentMyArrayList.clone();
//        newsMyArrayList.remove(1);
        Student student = newsMyArrayList.remove(1);
        System.out.println(student.getName());
//        for (int i = 0; i <newsMyArrayList.size() ; i++) {
//            System.out.println(newsMyArrayList.get(i).getName());
//        }

    }
}
