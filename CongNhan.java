package bai1;


public class CongNhan extends Canbo{
    int grade;
    public CongNhan(String name, int age, String gender, String address, int grade) {
        super(name, age, gender, address);
        this.grade = grade;
    }
    @Override
    public String toString() {
        return "Canbo [name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address + ", grade = " + grade + "]";
    }
}  
