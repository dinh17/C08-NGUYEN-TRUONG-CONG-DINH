package ss17_binary_file_and_serialization.exercise2.until;



import ss17_binary_file_and_serialization.exercise2.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndRead {
    public static List<Product> readFile() throws IOException {
        File file = new File("D:\\Codegym\\C08-NGUYEN-TRUONG-CONG-DINH\\module2-C08\\src\\ss17_binary_file_and_serialization\\exercise2\\data\\data.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<Product> list = new ArrayList<>();
        String line ;
        while ((line=bufferedReader.readLine())!=null){
            String[] arr = line.split(",");
            Product product = new Product(Integer.parseInt(arr[0]),arr[1],Double.parseDouble(arr[2]));
            list.add(product);
        }
        bufferedReader.close();
        return list;
    }


   public static  void writeFile(List<Product> productList) throws IOException {
        File file = new File("D:\\Codegym\\C08-NGUYEN-TRUONG-CONG-DINH\\module2-C08\\src\\ss17_binary_file_and_serialization\\exercise2\\data\\data.csv");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Product item : productList ) {
              bufferedWriter.write(item.getId()+","+item.getName()+","+item.getPrice());
              bufferedWriter.newLine();
        }
       bufferedWriter.flush();
       bufferedWriter.close();
    }
}
