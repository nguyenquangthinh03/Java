package bai1;
import java.util.Scanner;


public class main_canbo {
    public static void main(String[] args) {
        QLCB manager = new QLCB();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1: add");
            System.out.println("2: find");
            System.out.println("3: show");
            System.out.println("4: exit");
            System.out.println("Nhap lua chon cua ban: ");
            int line = Integer.parseInt(sc.nextLine());
            switch (line) {
                case 1:
                    System.out.println("1: Cong Nhan");
                    System.out.println("2: Ky Su");
                    System.out.println("3: Nhan Vien");
                    System.out.println("Nhap loai nhan vien: ");
                    line = Integer.parseInt(sc.nextLine());
                    switch (line) {
                        case 1:
                            System.out.println("Nhap cong nhan: ");
                            System.out.println("Ten: ");
                            String name = sc.nextLine();
                            System.out.println("Tuoi: ");
                            int age = Integer.parseInt(sc.nextLine());
                            System.out.println("gioi tinh: ");
                            String gender = sc.nextLine();
                            System.out.println("dia chi: ");
                            String address = sc.nextLine();
                            System.out.println("bac: ");
                            Integer grade = Integer.parseInt(sc.nextLine());
                            CongNhan congnhan = new CongNhan(name, age, gender, address, grade);
                            manager.add(congnhan);
                            break;
                        case 2:
                            System.out.println("Nhap ky su: ");
                            System.out.println("Ten: ");
                            String kname = sc.nextLine();
                            System.out.println("Tuoi: ");
                            int kage = Integer.parseInt(sc.nextLine());
                            System.out.println("gioi tinh: ");
                            String kgender = sc.nextLine();
                            System.out.println("dia chi: ");
                            String kaddress = sc.nextLine();
                            System.out.println("chuyen mon: ");
                            String major = sc.nextLine();
                            KySu kysu = new KySu(kname, kage, kgender, kaddress, major);
                            manager.add(kysu);
                            break;
                        case 3:
                            System.out.println("Nhap nhan vien: ");

                            NhanVien nhanvien = new NhanVien(sc.nextLine(), Integer.parseInt(sc.nextLine()),
                                    sc.nextLine(), sc.nextLine(), sc.nextLine());
                            manager.add(nhanvien);
                            break;
                    }
                    break;
                case 2:
                    String name = sc.nextLine();
                    manager.searchOfficerByName(name);
                    break;
                case 3:
                    manager.showListInforOfficer();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("invalid");
            }
        }
    }
}
