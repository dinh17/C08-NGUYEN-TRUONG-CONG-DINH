package baitapthicuoimodule2.until;


import baitapthicuoimodule2.model.Product;

import java.util.Comparator;

public class Sort implements Comparator<Product> {
    public int compare(Product product1, Product product2) {
//        if(product1.getPrice()==product2.getPrice()){
//            return 0 ;
//        }
//        if(product1.getPrice()>product2.getPrice()){
//            return 1 ;
//        }
//        else {
//            return -1 ;
//        }
        return product2.getNameProduct().compareTo(product1.getNameProduct());
    }

}