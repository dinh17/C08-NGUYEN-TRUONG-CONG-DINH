package baitapthicuoimodule2.until;

import baitapthicuoimodule2.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteRead {
    public static List<Product>  readFile() throws IOException {
        File file = new File("src\\baitapthicuoimodule2\\data\\product.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
          List<Product> productList = new ArrayList<>();
          String line ;
          while((line=bufferedReader.readLine())!=null){
              String[] arr = line.split(",");
              Product product = new Product(Integer.parseInt(arr[0]),arr[1],arr[2],Double.parseDouble(arr[3]));
              productList.add(product);
          }

        bufferedReader.close();
          return productList;
    }
    public static void writeFile(List<Product> productList) throws IOException {
        File file1 = new File("src\\baitapthicuoimodule2\\data\\product.csv");
        FileWriter fileWriter = new FileWriter(file1);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Product item : productList) {
            bufferedWriter.write(item.getId()+","+item.getNameProduct()+","+item.getHang()+","+item.getPrice());
           bufferedWriter.newLine();
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
