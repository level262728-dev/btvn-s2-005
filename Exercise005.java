package exercise005;

import java.util.Scanner;

public class Exercise005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập một số nguyên từ 1 đến 12 tương ứng với tháng
        System.out.print("Nhập một số nguyên từ 1 đến 12 (tháng): ");
        int month = scanner.nextInt();

        // Sử dụng cấu trúc switch-case để kiểm tra và hiển thị số ngày trong tháng
        switch (month) {
            case 1:
                System.out.println("Tháng 1 có 31 ngày.");
                break;
            case 2:
                System.out.println("Tháng 2 có 28 hoặc 29 ngày.");
                break;
            case 3:
                System.out.println("Tháng 3 có 31 ngày.");
                break;
            case 4:
                System.out.println("Tháng 4 có 30 ngày.");
                break;
            case 5:
                System.out.println("Tháng 5 có 31 ngày.");
                break;
            case 6:
                System.out.println("Tháng 6 có 30 ngày.");
                break;
            case 7:
                System.out.println("Tháng 7 có 31 ngày.");
                break;
            case 8:
                System.out.println("Tháng 8 có 31 ngày.");
                break;
            case 9:
                System.out.println("Tháng 9 có 30 ngày.");
                break;
            case 10:
                System.out.println("Tháng 10 có 31 ngày.");
                break;
            case 11:
                System.out.println("Tháng 11 có 30 ngày.");
                break;
            case 12:
                System.out.println("Tháng 12 có 31 ngày.");
                break;
            default:
                // Xử lý trường hợp người dùng nhập số không hợp lệ
                System.out.println("Tháng không hợp lệ.");
                break;
        }

        scanner.close();
    }
}