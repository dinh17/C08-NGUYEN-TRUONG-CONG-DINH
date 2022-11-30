package baitapthicuoimodule.model;

public class Student  extends Person{
   private double score ;


    public Student(double score) {
        this.score = score;
    }

    public Student(int id, String name, String sex, String numberPhone, String mail, double score) {
        super(id, name, sex, numberPhone, mail);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return super.toString()+"Student{" +
                "score=" + score +
                '}';
    }
}
