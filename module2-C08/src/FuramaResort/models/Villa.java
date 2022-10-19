package FuramaResort.models;

public class Villa extends Facility{
    private int totalPrice;
    private int totalDate;
    private String name;
    private int numberBed;
    private float size;

    public int getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
    public int getTotalDate() {
        return totalDate;
    }
    public void setTotalDate(int totalDate) {
        this.totalDate = totalDate;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNumberBed() {
        return numberBed;
    }
    public void setNumberBed(int numberBed) {
        this.numberBed = numberBed;
    }
    public float getSize() {
        return size;
    }
    public void setSize(float size) {
        this.size = size;
    }

    public Villa(String nameVilla, Customer customer, int totalDate) {
        this.name = nameVilla;
        this.totalDate = totalDate;
    }
}
