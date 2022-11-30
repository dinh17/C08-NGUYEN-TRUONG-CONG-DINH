package baitapthicuoimodule.service.impl;

import baitapthicuoimodule.model.Student;
import baitapthicuoimodule.service.IService;
import baitapthicuoimodule.util.Regex;



import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static baitapthicuoimodule.util.WriteRead.readStudent;
import static baitapthicuoimodule.util.WriteRead.writeStudent;

public class Service implements IService {
       Scanner scanner = new Scanner(System.in);

    @Override
    public void addStudent() throws IOException {
        List<Student> studentList = readStudent();
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên ");
        String nameStudent = scanner.nextLine();
        System.out.println("Nhập giới tính");
        String sex = Regex.sex();
        System.out.println("Nhập điểm ");
        double score = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập địa chỉ email");
        String mail = Regex.emai();
        System.out.println("Nhập số điện thoại");
        String numberPhone = Regex.phone();
        Student student = new Student(id,nameStudent,sex,numberPhone,mail,score);
        studentList.add(student);
        writeStudent(studentList);
    }

    @Override
    public void displayStudent() throws IOException {
        for (Student studentList :readStudent()) {
            System.out.println(studentList);
        }
    }

    @Override
    public void removeStudent() {

    }

    @Override
    public void editStudent() {

    }
}
