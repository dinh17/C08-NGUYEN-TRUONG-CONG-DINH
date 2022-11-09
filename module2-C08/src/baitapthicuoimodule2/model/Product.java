package baitapthicuoimodule2.model;

public class Product {
    private int id ;
    private String nameProduct ;
    private String Hang ;
    private double price ;

    public Product() {
    }

    public Product(int id, String nameProduct, String hang, double price) {
        this.id = id;
        this.nameProduct = nameProduct;
        Hang = hang;
        this.price = price;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getHang() {
        return Hang;
    }

    public void setHang(String hang) {
        Hang = hang;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nameProduct='" + nameProduct + '\'' +
                ", Hang='" + Hang + '\'' +
                ", price=" + price +
                '}';
    }


}
