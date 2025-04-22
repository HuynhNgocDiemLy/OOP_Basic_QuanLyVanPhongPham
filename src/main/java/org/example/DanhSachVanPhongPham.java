package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSachVanPhongPham {
    private List<VanPhongPham> danhSach;
    private int soLuong;

    public DanhSachVanPhongPham() {
        this.danhSach = new ArrayList<>();
        this.soLuong = 0;
    }

    public List<VanPhongPham> getDanhSach() {
        return danhSach;
    }

    //Phương tức thêm một văn phòng phẩm
    public void themVanPhongPham(){
        Scanner input = new Scanner (System.in);
        System.out.println("Chọn loại văn phòng phẩm: ");
        System.out.println("1. Tập");
        System.out.println("2. Viết");
        System.out.println("Lựa chọn của bạn: ");
        int choice = input.nextInt();
        VanPhongPham vpp = null;
        switch (choice){
            case 1:
                vpp = new Tap();
                break;
            case 2:
                vpp = new Viet();
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
                System.out.println("Vui lòng chọn loại văn phòng phẩm: \n1. Tập \n2. Viết");
        }
        vpp.nhap();
        danhSach.add(vpp);
        soLuong++;
        System.out.println("Thêm văn phòng phẩm thành công!");
    }

    //Xuất thông tin tất cả văn phòng phẩm trong danh sách
    public void xuatTatCa(){
        if (soLuong == 0) {
            System.out.println("Danh sách rỗng!");
        }
        System.out.println("===== DANH SÁCH VĂN PHÒNG PHẨM =====");
        for (VanPhongPham vpp : danhSach){
            if (vpp instanceof Viet){
                vpp.xuatThongTin();
            }
            else{
                vpp.xuatThongTin();
            }
            System.out.println("------------------------");
        }

    }

    //Phương thức tìm kiếm văn phòng phẩm có đơn giá thấp nhất
    public void timKiemDonGiaThapNhat() {
        if (soLuong == 0) {
            System.out.println("Danh sách rỗng!");
            return;
        }

        // Tìm đơn giá thấp nhất
        double minPrice = danhSach.get(0).getDonGia();
        for (int i = 1; i < soLuong; i++) {
            if (danhSach.get(i).getDonGia() < minPrice) {
                minPrice = danhSach.get(i).getDonGia();
            }
        }
        // Xuất thông tin các văn phòng phẩm có đơn giá thấp nhất
        System.out.println("\n===== VĂN PHÒNG PHẨM CÓ ĐƠN GIÁ THẤP NHẤT =====");
        for (int i = 0; i < soLuong; i++) {
            if (danhSach.get(i).getDonGia() == minPrice) {
                danhSach.get(i).xuatThongTin();
                System.out.println("------------------------");
            }
        }
    }

}
