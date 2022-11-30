package baitapthicuoimodule.util;

import baitapthicuoimodule.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteRead {

    public static List<Student> readStudent() throws IOException {
        File file1 = new File("src\\baitapthicuoimodule\\data\\student.csv");
        FileReader fileReader = new FileReader(file1);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        List<Student> studentList = new ArrayList<>();
        while((line=bufferedReader.readLine())!=null){
            String[] arr = line.split(",");
            Student student = new Student((Integer.parseInt(arr[0])),arr[1],arr[2],arr[3],arr[4],(Double.parseDouble(arr[5])));
            studentList.add(student);
        }
        bufferedReader.close();
        return studentList ;
    }
    public static void writeStudent(List<Student> studentList) throws IOException {
        File file  = new File("src\\baitapthicuoimodule\\data\\student.csv");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for(Student item : studentList ){
            bufferedWriter.write(item.getId()+","+item.getName()+","+item.getSex()+","+item.getMail()+","+item.getNumberPhone()+","+item.getScore() );
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
        bufferedWriter.close();

    }
}
