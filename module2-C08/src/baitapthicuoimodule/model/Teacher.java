package baitapthicuoimodule.model;

public class Teacher extends Person{
    private double salary ;

    public Teacher(double salary) {
        this.salary = salary;
    }

    public Teacher(int id, String name, String sex, String numberPhone, String mail, double salary) {
        super(id, name, sex, numberPhone, mail);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString()+"Teacher{" +
                "salary=" + salary +
                '}';
    }
}
