package baitap3;

import java.util.Scanner;

public class BaiTap3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap mot ky tu: ");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            System.out.println("Ky tu ban nhap la so nguyen: " + number);
        } else {
            System.out.println("Ky tu ban nhap khong phai la so nguyen.");
        }

        scanner.close();
    }
    
}
