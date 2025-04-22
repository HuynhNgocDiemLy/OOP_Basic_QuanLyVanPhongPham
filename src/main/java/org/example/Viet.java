package org.example;

import java.util.Scanner;

public class Viet extends VanPhongPham{
    private String mauMuc;

    // Constructor
    public Viet() {
        super();
        this.mauMuc = "";
    }
    public Viet(String ma, String ten, double donGia, String mauMuc) {
        super(ma, ten, donGia);
        this.mauMuc = mauMuc;
    }

    public String getMauMuc() {
        return mauMuc;
    }

    public void setMauMuc(String mauMuc) {
        this.mauMuc = mauMuc;
    }

    @Override
    public void nhap(){
        super.nhap();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập màu mực cho viết: ");
        mauMuc = input.nextLine();
    }
    @Override
    public void xuatThongTin(){
        super.xuatThongTin();
        System.out.println("Màu mực của viết: " + getMauMuc());
    }
}
