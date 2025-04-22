package org.example;

import java.util.Scanner;

public class VanPhongPham {
    private String ma;
    private String ten;
    private double donGia;

    // Constructor
    public VanPhongPham() {
        this.ma = "";
        this.ten = "";
        this.donGia = 0.0;
    }
    public VanPhongPham(String ma, String ten, double donGia) {
        this.ma = ma;
        this.ten = ten;
        this.donGia = donGia;
    }


    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    //Phương thức nhập thông tin Văn Phòng Phẩm
    public void nhap(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập mã văn phòng phẩm: ");
        ma = input.nextLine();
        System.out.println("Nhập tên văn phòng phẩm: ");
        ten = input.nextLine();
        System.out.println("Nhập đơn giá: ");
        donGia = input.nextDouble();
    }

    //Phương thức xuất thông tin
    public void xuatThongTin(){
        System.out.println("Mã văn phòng phẩm: " + getMa());
        System.out.println("Tên văn phòng phẩm: " + getTen());
        System.out.println("Đơn giá: " + getDonGia());
    }
}
