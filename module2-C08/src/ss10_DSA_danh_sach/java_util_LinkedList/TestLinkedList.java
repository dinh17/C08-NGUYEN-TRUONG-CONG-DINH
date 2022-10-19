package ss10_DSA_danh_sach.java_util_LinkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        class Student {
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
        MyLinkedList<Student> myLinkedList = new MyLinkedList<>();
        Student student1 = new Student(1, "Hai");
        Student student2 = new Student(2, "Hai1");
        Student student3 = new Student(3, "Hai2");
        Student student4 = new Student(4, "Hai3");
        Student student5 = new Student(4, "Hai3");

        myLinkedList.addLast(student1);
        myLinkedList.addLast(student2);
        myLinkedList.addLast(student3);
        myLinkedList.addLast(student4);

//        System.out.println(myLinkedList.constrains(student5));
//        System.out.println(myLinkedList.indexOf(student2));
//        myLinkedList.remove(student2);
        MyLinkedList<Student > cloneLinkedList = myLinkedList.clone();

        for (int i = 0; i < cloneLinkedList.size(); i++) {
            Student student = (Student) cloneLinkedList.get(i);
            System.out.println(student.getName());
        }
    }
}
