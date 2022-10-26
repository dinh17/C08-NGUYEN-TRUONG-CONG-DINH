package ss16_IO_text_file.exercise.read_file_csv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {

    public static List<String> readFile(String path) {
        List<String> list = new ArrayList<>();

        String line;
        int sum = 0;

        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                sum += line.length();
                list.add(line);
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(" Số kí tự có trong mảng là: " + sum);
        return list;
    }

    public static void writeFile(String path, List<String> list) {
        try {
            File file1 = new File(path);
            FileWriter fileWriter = new FileWriter(file1);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (String item : list) {
                bufferedWriter.write(item);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String sourcePath = "src\\ss16_IO_text_file\\exercise\\ReadFileCSV\\source.csv ";
        String targetPath = "src\\ss16_IO_text_file\\exercise\\ReadFileCSV\\target.csv";
        CopyFile.writeFile(targetPath, CopyFile.readFile(sourcePath));
    }
}