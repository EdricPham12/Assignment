package baitap2;

import java.util.Scanner;

public class BaiTap2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao ky tu hoac chuoi: ");

        if (scanner.hasNext()) {
            String input = scanner.next();

            if (input.length() == 1) {
                System.out.println("Ban da nhap mot ky tu: " + input);
            } else {
                System.out.println("Ban da nhap mot chuoi: " + input);
            }
        }

        scanner.close();
    }
}
