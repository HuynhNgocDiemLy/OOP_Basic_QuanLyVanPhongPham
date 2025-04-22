package org.example;

import java.util.Scanner;

public class Tap extends VanPhongPham{
    private int soTrang;

    // Constructor
    public Tap() {
        super();
        this.soTrang = 0;
    }
    public Tap(String ma, String ten, double donGia, int soTrang) {
        super(ma, ten, donGia);
        this.soTrang = soTrang;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public void nhap(){
        super.nhap();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số trang cho tập: ");
        soTrang = input.nextInt();
    }
    @Override
    public void xuatThongTin(){
        super.xuatThongTin();
        System.out.println("Số trang: " + getSoTrang());
    }
}
