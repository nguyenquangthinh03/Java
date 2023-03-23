package bai1;

public class NhanVien extends Canbo{
     String work;
    public NhanVien(String name, int age, String gender, String address, String work) {
        super(name, age, gender, address);
        this.work = work;
    }
    @Override
    public String toString() {
        return "Canbo [name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address + ", work = " + work + "]";
    }

    public String getWork() {
        return work;
    }

}
    

