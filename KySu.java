package bai1;


public class KySu extends Canbo{
    String major;
    public KySu(String name, int age, String gender, String address, String major) {
        super(name, age, gender, address);
        this.major=major;
    }
    @Override
    public String toString() {
        return "Canbo [name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address + ", major= " + major + "]";
    }

}