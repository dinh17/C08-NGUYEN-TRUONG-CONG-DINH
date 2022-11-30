package baitapthicuoimodule.model;

public abstract  class Person {
    private int id ;
    private String name ;
    private String sex ;
    private String numberPhone ;
    private String mail ;

    public Person() {
    }

    public Person(int id, String name, String sex, String numberPhone, String mail) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.numberPhone = numberPhone;
        this.mail = mail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
