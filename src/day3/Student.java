package day3;
public class Student {
    private String name;
    private String surname;
    private String idNo;
    private int age;
    private int number;
    private int class1;
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", ıdNo='" + idNo + '\'' +
                ", age=" + age +
                ", number=" + number +
                ", class1=" + class1 +
                '}';
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name =name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname =surname;
    }
    public String getIdNo() {
        return idNo;
    }
    public void setIdNo(String kimlikNo) {
        this.idNo = kimlikNo;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {this.age =age;}
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public int getClass1() {
        return class1;
    }
    public void setClass1(int class1) {
        this.class1 = class1;
    }

    public Student() {
    }
    public Student(String name, String surname, String idNo, int age, int number, int class1) {
        this.name = name;
        this.surname = surname;
        this.idNo= idNo;
        this.age = age;
        this.number = number;
        this.class1 = class1;
    }
}
