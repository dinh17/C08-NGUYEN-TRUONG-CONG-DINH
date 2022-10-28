package ss12_collection_framework.exercise.product_management.model;


public class Product {
    private String productName;
    private double price;
    private int id = 1;
    private String hang ;

    public Product(String productName, double price, String hang,int id) {
        this.productName = productName;
        this.price = price;
        this.hang = hang;
        this.id = id;
    }

    public Product(double price) {
        this.price = price;
    }

    public Product(String productName, double price, String hang) {
        this.productName = productName;
        this.price = price;
        this.hang = hang;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
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
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", id=" + id +
                ", hang='" + hang + '\'' +
                '}';
    }
}