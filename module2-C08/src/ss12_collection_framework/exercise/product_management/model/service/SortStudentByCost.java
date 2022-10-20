package ss12_collection_framework.exercise.product_management.model.service;

import ss12_collection_framework.exercise.product_management.model.Product;

import java.util.Comparator;

public class SortStudentByCost implements Comparator<Product> {
    public int compare(Product product1, Product product2) {
        if (product1.getCost() > product2.getCost()) {
            return 1;
        }
        return -1;
    }

}

