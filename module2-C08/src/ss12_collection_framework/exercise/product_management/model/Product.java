package ss12_collection_framework.exercise.product_management.model;


public class Product {
    private String productName;
    private double price;
    private int id = 1;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public Product(String productName, double price, int id) {
        this.productName = productName;
        this.price = price;
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getCost() {
        return price;
    }

    public void setCost(double cost) {
        this.price = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", cost=" + price +
                '}';
    }


}