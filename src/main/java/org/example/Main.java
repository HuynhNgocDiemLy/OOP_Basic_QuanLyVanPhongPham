package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Khai báo một đối tượng danh sách văn phòng phẩm
        DanhSachVanPhongPham danhSach = new DanhSachVanPhongPham();

        // Gọi thực thi phương thức thêm một văn phòng phẩm vào danh sách
        danhSach.themVanPhongPham();

        // Phần menu để kiểm tra thêm các chức năng khác (không bắt buộc theo đề bài)
        Scanner scanner = new Scanner(System.in);
        int luaChon;

        do {
            System.out.println("\n===== QUẢN LÝ VĂN PHÒNG PHẨM =====");
            System.out.println("1. Thêm văn phòng phẩm mới");
            System.out.println("2. Xuất tất cả văn phòng phẩm");
            System.out.println("3. Tìm văn phòng phẩm có đơn giá thấp nhất");
            System.out.println("0. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            luaChon = scanner.nextInt();

            switch (luaChon) {
                case 1:
                    danhSach.themVanPhongPham();
                    break;
                case 2:
                    danhSach.xuatTatCa();
                    break;
                case 3:
                    danhSach.timKiemDonGiaThapNhat();
                    break;
                case 0:
                    System.out.println("Cảm ơn đã sử dụng chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (luaChon != 0);
    }
}