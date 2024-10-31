package baitap1date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;

public class BaiTap1Date {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Nhap ten: ");
        String ten = scanner.nextLine();

        System.out.print("Nhap tuoi: ");
        int tuoi = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhap gioi tinh: ");
        String gioiTinh = scanner.nextLine();

        System.out.print("Nhap chuyen nganh: ");
        String chuyenNganh = scanner.nextLine();

        System.out.print("Nhap GPA: ");
        double gpa = Double.parseDouble(scanner.nextLine());

        System.out.print("Nhap que quan: ");
        String queQuan = scanner.nextLine();

        System.out.print("Nhap ngay sinh (dd/MM/yyyy): ");
        Date ngaySinh = null;
        try {
            ngaySinh = dateFormat.parse(scanner.nextLine());
        } catch (ParseException e) {
            System.out.println("Ngay sinh khong dung dinh dang.");
        }

        // Hien thi tat ca thong tin ra man hinh
        System.out.println("\nThong Tin Sinh Vien:");
        System.out.println("Ten: " + ten);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Gioi Tinh: " + gioiTinh);
        System.out.println("Chuyen Nganh: " + chuyenNganh);
        System.out.println("GPA: " + gpa);
        System.out.println("Que Quan: " + queQuan);
        System.out.println("Ngay Sinh: " + dateFormat.format(ngaySinh));

        scanner.close();
    }
    
}
